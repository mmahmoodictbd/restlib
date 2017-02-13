package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;

@RestResource
public class GetReqPathParamResource {
	/*
	 * Sample command - curl -v -XGET
	 * http://localhost:8080/getRequestWithPathParams/mahmood/28 TODO: Can not
	 * handle param type other then String, yet!
	 */
	@Path(mapping = "getRequestWithPathParams/{name}/{age}", requestMethod = HttpMethod.GET, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public String getRequestWithPathParams(String name, String age) {
		return "{\"name\":\"" + name + "\",\"age\":" + age + "\"}";
	}

}