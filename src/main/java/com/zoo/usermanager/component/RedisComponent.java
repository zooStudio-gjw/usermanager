package com.zoo.usermanager.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisComponent {

    @Autowired
    private StringRedisTemplate template;


    public void set(String key,String value){
        ValueOperations<String,String> ops = this.template.opsForValue();
        if(!this.template.hasKey(key)){
            ops.set(key,value);
        }
    }

    public String get(String key){
        return this.template.opsForValue().get(key);
    }

    public void delete(String key){
        this.template.delete(key);
    }


}
