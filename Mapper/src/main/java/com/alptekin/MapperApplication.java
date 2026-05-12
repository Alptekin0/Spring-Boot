package com.alptekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.alptekin")
public class MapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapperApplication.class, args);
	}

}
