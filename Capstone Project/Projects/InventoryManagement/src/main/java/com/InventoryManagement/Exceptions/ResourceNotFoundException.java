package com.InventoryManagement.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
 String resourceName;
 String field;
 long fieldValue;
 String message;
public ResourceNotFoundException(String resourceName, String field, long fieldValue) {
	super(String.format("%s not found with %s:%s",resourceName,field,fieldValue));
	this.resourceName = resourceName;
	this.field = field;
	this.fieldValue = fieldValue;
	//this.message = message;
	
	
}
 
}
