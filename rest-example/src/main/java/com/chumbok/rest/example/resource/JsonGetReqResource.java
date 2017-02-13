package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;

@RestResource
public class JsonGetReqResource {

	public static final String SIMPLE_JSON = "{\"msg\" : \"Hellooooooo World!\"}";

	/*
	 * Sample command - curl -v -XGET http://localhost:8080/jsonGetRequest
	 */
	@Path(mapping = "jsonGetRequest", requestMethod = HttpMethod.GET, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public String jsonGetRequest() {
		return SIMPLE_JSON;
	}

}