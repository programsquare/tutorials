package com.programsquare.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRenameAppPropertiesApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "customapp");
		SpringApplication.run(SpringBootRenameAppPropertiesApplication.class, args);
	}

}
