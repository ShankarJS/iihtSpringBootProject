package com.iiht.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldVlaue;
	
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFieldVlaue() {
		return fieldVlaue;
	}
	public void setFieldVlaue(Object fieldVlaue) {
		this.fieldVlaue = fieldVlaue;
	}
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldVlaue) {
		super(String.format("%s not found with %s: %s", resourceName, fieldName, fieldVlaue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldVlaue = fieldVlaue;
	}
	
	
}
