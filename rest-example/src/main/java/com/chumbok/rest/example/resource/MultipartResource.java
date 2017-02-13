package com.chumbok.rest.example.resource;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.annotation.RestResource;
import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.requestresponse.Request;

@RestResource
public class MultipartResource {

	/*
	 * curl -v -XPOST http://localhost:8080/multipartRequest --form
	 * "fileupload=@/tmp/agile.jpg;filename=a.txt" --form param1=value1 --form
	 * param2=value2
	 */
	@Path(mapping = "multipartRequest", requestMethod = HttpMethod.POST, responseContentType = MediaType.APPLICATION_JSON_TYPE)
	public void multipartPost(Request request) {
		System.out.println(request.getMultipart());
	}

}