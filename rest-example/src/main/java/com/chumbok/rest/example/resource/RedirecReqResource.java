package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

@RestResource
public class RedirecReqResource {

	/*
	 * Sample command - curl -v -XGET http://localhost:8080/redirectRequest
	 */
	@Path(mapping = "redirectRequest", requestMethod = HttpMethod.GET, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public void getRequestWithResponseHeader(Request request, Response response) {
		response.redirect(request.getBaseUri() + "plainTextGetRequest");
	}

}