package com.chumbok.rest.filter;

import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public interface Filter {
	void filter(Request request, Response response);
}
