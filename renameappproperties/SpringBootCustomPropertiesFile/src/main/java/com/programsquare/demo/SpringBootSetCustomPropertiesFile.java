package com.programsquare.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootSetCustomPropertiesFile {


	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootRenameAppPropertiesApplication.class)
		.properties("spring.config.name:customapp")
		.build()
		.run(args);
	}

}
