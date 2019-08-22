package com.zoo.usermanager.configuration;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

@Configuration
public class RedisCacheConfig extends CachingConfigurerSupport {


    @Bean
    public CacheManager getCacheManager(RedisConnectionFactory redisConnectionFactory){
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(1));
        return RedisCacheManager.builder(RedisCacheWriter.lockingRedisCacheWriter(redisConnectionFactory)).cacheDefaults(redisCacheConfiguration).build();
    }

}
