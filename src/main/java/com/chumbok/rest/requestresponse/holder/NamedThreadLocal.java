package com.chumbok.rest.requestresponse.holder;

import com.chumbok.rest.util.AssertUtil;

public class NamedThreadLocal<T> extends ThreadLocal<T> {

	private final String name;

	public NamedThreadLocal(String name) {
		AssertUtil.hasText(name, "Name must not be empty");
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}
