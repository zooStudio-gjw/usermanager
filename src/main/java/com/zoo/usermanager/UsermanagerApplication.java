package com.zoo.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ServletComponentScan
@EnableCaching
public class UsermanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagerApplication.class, args);
	}

}
