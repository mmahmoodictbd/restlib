package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.example.dto.Hello;

@RestResource
public class ComplexResource {

	/*
	 * Sample command - curl -XPOST http://localhost:8080/complexRequest/mahmood
	 * -d '{"msg1":"Hello","msg2":"World"}'
	 */
	@Path(mapping = "complexRequest/{name}", requestMethod = HttpMethod.POST, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public void getHello2Post(String name, Hello hello) {
		System.out.println("---->" + name);
		System.out.println("---->" + hello);
	}

}