package com.chumbok.rest.filter;

import java.lang.reflect.Method;

import com.chumbok.rest.annotation.Path;
import com.chumbok.rest.requestresponse.Request;
import com.chumbok.rest.requestresponse.Response;

public class GenericPreFilterHandler implements PreFilterHandler<Method> {

	private Method method;

	public GenericPreFilterHandler(Method method) {
		this.method = method;
	}

	@Override
	public void handle(Request request, Response response) {

		Path path = method.getAnnotation(Path.class);
		@SuppressWarnings("unchecked")
		Class<PreFilter>[] prefilters = (Class<PreFilter>[]) path.preFilters();

		for (Class<PreFilter> filterCls : prefilters) {
			PreFilter preFilter;
			try {
				preFilter = filterCls.newInstance();
				preFilter.filter(request, response);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}

		}
	}

}
