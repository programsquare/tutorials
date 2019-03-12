package com.programsquare.bannerdisable;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DisableBannerProgramApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DisableBannerProgramApplication.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}

}
