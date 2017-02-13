package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;

@RestResource
public class GenericExceptionTestResource {

	@Path(mapping = "error")
	public String testError() {
		throw new IllegalArgumentException();
	}

}