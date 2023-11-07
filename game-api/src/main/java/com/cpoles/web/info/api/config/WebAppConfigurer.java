package com.cpoles.web.info.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    private CacheManager cacheManager;

    @Autowired
    public WebAppConfigurer(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(new AuthenticationInterceptor(cacheManager.getCache("tokens")));
        addInterceptor
                .excludePathPatterns("/welcome")
                .excludePathPatterns("/login")
                .excludePathPatterns("/login/sms")
                .excludePathPatterns("/register")
                .excludePathPatterns("/register")
                .excludePathPatterns("/sendCode");
        addInterceptor.addPathPatterns("/**");
    }
}
