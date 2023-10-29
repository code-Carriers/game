package com.cpoles.web.info.api.config;

import com.cpoles.web.info.api.domain.entity.SysUser;
import org.springframework.cache.Cache;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {
    private Cache tokenCache;

    AuthenticationInterceptor(Cache tokenCache) {
        this.tokenCache = tokenCache;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {

        String accessToken = request.getHeader("token");
        if (StringUtils.isEmpty(accessToken)) {
            accessToken = request.getParameter("token");
        }

        if (StringUtils.isEmpty(accessToken)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value());
            return false;
        }

        SysUser user = tokenCache.get(accessToken, SysUser.class);
        if (user == null) {
            response.sendError(HttpStatus.UNAUTHORIZED.value());
            return false;
        }

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) {
    }
}
