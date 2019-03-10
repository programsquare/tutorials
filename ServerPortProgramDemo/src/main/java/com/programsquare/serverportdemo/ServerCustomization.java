/**
 * 
 */
package com.programsquare.serverportdemo;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * @author vsurapaneni
 *
 */
@Component
public class ServerCustomization implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory > {

	public void customize(ConfigurableServletWebServerFactory server) {
		server.setPort(9002);
	}

}
