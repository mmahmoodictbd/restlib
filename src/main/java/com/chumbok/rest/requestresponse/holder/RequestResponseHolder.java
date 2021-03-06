package com.chumbok.rest.requestresponse.holder;

import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public class RequestResponseHolder {

	private static final ThreadLocal<Request> requestHolder = new NamedThreadLocal<Request>("Requests");
	private static final ThreadLocal<Response> responseHolder = new NamedThreadLocal<Response>("Responses");

	public static void setRequest(Request request) {
		requestHolder.set(request);
	}

	public static void setResponse(Response response) {
		responseHolder.set(response);
	}

	public static Request getRequest() {
		return requestHolder.get();
	}

	public static Response getResponse() {
		return responseHolder.get();
	}
}
