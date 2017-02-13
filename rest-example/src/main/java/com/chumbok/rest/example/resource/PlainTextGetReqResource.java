package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;

@RestResource
public class PlainTextGetReqResource {

	/*
	 * Sample command - curl -v -XGET http://localhost:8080/plainTextGetRequest
	 */
	@Path(mapping = "plainTextGetRequest", requestMethod = HttpMethod.GET, responseContentType = MediaType.TEXT_PLAIN_TYPE)
	public String plainTextGetRequest() {
		return "plainTextGetRequest - response";
	}

}