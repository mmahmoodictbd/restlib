package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;

public class IgnoredPathExampleResource {

	/*
	 * Sample command - curl -v -XGET http://localhost:8080/helloGetRequest
	 */
	@Path(mapping = "helloGetRequest", requestMethod = HttpMethod.GET, responseContentType = MediaType.TEXT_PLAIN_TYPE)
	public String helloGetRequest() {
		return "hello!";
	}

}