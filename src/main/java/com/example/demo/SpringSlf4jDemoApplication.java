package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.example.demo.mapper")
@SpringBootApplication
public class SpringSlf4jDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSlf4jDemoApplication.class, args);
	}

}
