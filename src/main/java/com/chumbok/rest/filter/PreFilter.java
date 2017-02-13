package com.chumbok.rest.filter;

import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public interface PreFilter {
	void filter(Request request, Response response);
}
