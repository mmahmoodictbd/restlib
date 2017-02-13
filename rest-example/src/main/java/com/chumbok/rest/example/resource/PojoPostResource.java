package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.example.dto.Hello;

@RestResource
public class PojoPostResource {

	/*
	 * Sample command - curl -XPOST
	 * http://localhost:8080/jsonPostRequestWithPojoJsonResponse -d
	 * '{"msg1":"Hello","msg2":"World"}'
	 */
	@Path(mapping = "jsonPostRequestWithPojoJsonResponse", requestMethod = HttpMethod.POST, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public Hello jsonPostRequestWithPojoJsonResponse(Hello hello) {
		return hello;
	}

}