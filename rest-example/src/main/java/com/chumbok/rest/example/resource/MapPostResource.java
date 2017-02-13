package com.chumbok.rest.example.resource;

import java.util.Map;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;

@RestResource
public class MapPostResource {

	/*
	 * Sample command - curl -XPOST http://localhost:8080/rest/postReqWithMap/some/thing -d '{"msg1":"Hello","msg2":"World"}'
	 */
	@Path(mapping = "postReqWithMap/{some}/{thing}", requestMethod = HttpMethod.POST, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public Map jsonGetRequestWithPojoJsonResponse(String some, String thing, Map inMap) {
		System.out.println("Some - " + some);
		System.out.println("Thing - " + thing);
		return inMap;
	}

}