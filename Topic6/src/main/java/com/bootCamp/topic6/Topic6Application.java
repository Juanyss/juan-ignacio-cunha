package com.bootCamp.topic6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.bootCamp.topic6.domain")
public class Topic6Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic6Application.class, args);
	}

}

