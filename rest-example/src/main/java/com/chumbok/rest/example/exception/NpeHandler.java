package com.chumbok.rest.example.exception;

import com.chumbok.rest.exception.ErrorMessage;
import com.chumbok.rest.exception.ExceptionHandler;
import com.chumbok.rest.exception.GenericErrorMessage;
import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;
import com.chumbok.rest.requestresponse.Status;

public class NpeHandler implements ExceptionHandler {

	public void handle(Request request, Response response, Exception e) {
		ErrorMessage msg = new GenericErrorMessage(Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.toString());
		response.setEntity(msg);
		response.setStatus(Status.INTERNAL_SERVER_ERROR);
	}

}
