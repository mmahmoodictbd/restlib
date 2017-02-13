package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.example.filter.ExamplePreFilter;

@RestResource
public class PreFilterExampleResource {

	/*
	 * Sample command - curl -v -XGET http://localhost:8080/prefilterGetRequest
	 */
	@Path(mapping = "prefilterGetRequest", requestMethod = HttpMethod.GET, preFilters = { ExamplePreFilter.class })
	public String plainTextGetRequest() {
		return "plainTextGetRequest - response";
	}

}