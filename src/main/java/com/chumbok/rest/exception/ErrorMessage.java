package com.chumbok.rest.exception;

public interface ErrorMessage {
	int getStatusCode();

	void setStatusCode(int statusCode);

	String getMessage();

	void setMessage(String message);
}
