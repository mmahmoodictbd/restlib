package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.requestresponse.Request;

@RestResource
public class GetReqQueryParamResource {

	/*
	 * Sample command - curl -v -XGET
	 * http://localhost:8080/getRequestWithQueryParam\?name=mahmood
	 */
	@Path(mapping = "getRequestWithQueryParam", requestMethod = HttpMethod.GET)
	public String getRequestWithQueryParam(Request request) {
		return "{\"name\":\"" + request.getQueryParam("name") + "\"}";
	}

}