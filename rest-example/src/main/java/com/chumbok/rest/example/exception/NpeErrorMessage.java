package com.chumbok.rest.example.exception;

import com.chumbok.rest.exception.AbstructErrorMessage;

public class NpeErrorMessage extends AbstructErrorMessage {

	public NpeErrorMessage(int statusCode, String message) {
		setStatusCode(statusCode);
		setMessage(message);
	}
}
