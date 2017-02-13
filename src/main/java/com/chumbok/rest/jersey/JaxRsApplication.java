package com.chumbok.rest.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.chumbok.rest.Bootstrap;

@ApplicationPath("")
public class JaxRsApplication extends ResourceConfig {

	public JaxRsApplication() {
		Bootstrap<JaxRsApplication> bootstrap = new BootstrapJersey();
		bootstrap.init(this);
	}
}
