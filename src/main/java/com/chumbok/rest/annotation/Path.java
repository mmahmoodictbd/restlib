package com.chumbok.rest.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.chumbok.rest.entity.HttpMethod;
import com.chumbok.rest.entity.MediaType;
import com.chumbok.rest.exception.GenericExceptionHandler;

@Target({ java.lang.annotation.ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Path {

	String mapping() default "";

	HttpMethod requestMethod() default HttpMethod.GET;

	MediaType responseContentType() default MediaType.APPLICATION_JSON_TYPE;

	Class<?> exceptionHandler() default GenericExceptionHandler.class;

	Class<?>[] preFilters() default {};

}