package com.chumbok.rest;

public interface Bootstrap<T> {
	void init(T bootstrapedObj);
}
