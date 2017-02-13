package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.requestresponse.Response;

@RestResource
public class ReqRespResource {

	/*
	 * Sample command - curl -v -XGET
	 * http://localhost:8080/getRequestWithResponseHeader
	 */
	@Path(mapping = "getRequestWithResponseHeader", requestMethod = HttpMethod.GET, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public void getRequestWithResponseHeader(Response response) {
		response.setHeader("a", "b");
	}

}