package com.chumbok.rest.example.filter;

import com.chumbok.rest.filter.Filter;
import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public class ExampleFilter2 implements Filter {

	public void filter(Request request, Response response) {
		System.out.println("Inside ExampleFilter2.");
	}

}
