package com.alptekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.alptekin")
public class DataJpaDeleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaDeleteApplication.class, args);
	}

}