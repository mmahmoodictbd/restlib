package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.example.dto.Hello;

@RestResource
public class PojoRespResource {

	/*
	 * Sample command - curl -v -XGET
	 * http://localhost:8080/jsonGetRequestWithPojoJsonResponse
	 */
	@Path(mapping = "jsonGetRequestWithPojoJsonResponse", requestMethod = HttpMethod.GET, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public Hello jsonGetRequestWithPojoJsonResponse() {
		return new Hello("Hello", "World");
	}

}