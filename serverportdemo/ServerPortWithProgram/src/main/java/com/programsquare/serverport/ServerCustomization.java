package com.programsquare.serverport;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServerCustomization implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory > {

	public void customize(ConfigurableServletWebServerFactory server) {
		server.setPort(9002);
	}

}
