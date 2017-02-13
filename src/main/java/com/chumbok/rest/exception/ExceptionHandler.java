package com.chumbok.rest.exception;

import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public interface ExceptionHandler {

	void handle(Request request, Response response, Exception e);

}
