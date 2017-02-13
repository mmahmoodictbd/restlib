package com.chumbok.rest.filter;

import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public interface PreFilterHandler<T> {

	void handle(Request request, Response response);

}
