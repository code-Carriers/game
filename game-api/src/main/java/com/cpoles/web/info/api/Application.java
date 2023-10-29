package com.cpoles.web.info.api;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
@EnableScheduling
@EnableCaching
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CacheManager cacheManager() {

        ArrayList<CaffeineCache> caches = new ArrayList<>();

        CaffeineCache cacheTokens = new CaffeineCache("tokens", Caffeine.newBuilder()
            .initialCapacity(50)
            .maximumSize(5000)
            .expireAfterAccess(1, TimeUnit.DAYS)
            .recordStats().build(), false);
        caches.add(cacheTokens);

        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(caches);

        return cacheManager;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);//允许携带cookie
        config.addAllowedOrigin("*");//请求域
        config.addAllowedHeader("*");//请求头
        config.addAllowedMethod("*");//允许所有方法
        config.setMaxAge(18000L);//这段时间内，同一请求不再发送option请求校验
        config.addExposedHeader("Location");
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }

}
