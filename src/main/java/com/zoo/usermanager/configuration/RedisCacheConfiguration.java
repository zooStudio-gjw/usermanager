package com.zoo.usermanager.configuration;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisCacheConfiguration extends CachingConfigurerSupport {


    @Bean
    public CacheManager getCacheManager(RedisTemplate<? ,?> redisTemplate){
        RedisCacheManager manager = new RedisCacheManager(redisTemplate);

        return manager;
    }

}
