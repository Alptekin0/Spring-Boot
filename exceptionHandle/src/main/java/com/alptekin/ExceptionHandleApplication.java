package com.alptekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.alptekin")
public class ExceptionHandleApplication {

	public static void main(String	[] args) {
		SpringApplication.run(ExceptionHandleApplication.class, args);
	}

}
