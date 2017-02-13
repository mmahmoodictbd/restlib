package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.example.exception.NpeHandler;

@RestResource
public class NullPointerExceptionTestResource {

	@Path(mapping = "nullerror", exceptionHandler = NpeHandler.class)
	public String testNpe() {
		throw new NullPointerException("NPE :-(");
	}

}