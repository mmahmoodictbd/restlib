package com.chumbok.rest.example.filter;

import com.chumbok.rest.filter.PreFilter;
import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public class ExamplePreFilter implements PreFilter {

	public void filter(Request request, Response response) {
		System.out.println("Inside ExamplePreFilter.");
	}

}
