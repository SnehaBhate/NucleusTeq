package com.InventoryManagement.Exceptions;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
      
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex){
		 Map<String, String> resp=new HashMap<>();
		 
		 ex.getBindingResult().getAllErrors().forEach((error)->{
			 String fieldName = ((FieldError)error).getField();
			 String message = error.getDefaultMessage();
			 resp.put(fieldName, message);
		 });
		 
		 return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex){
//		Map<String , String> errorMap = new HashMap<>();
//		errorMap.put("errorMessage",ex.getMessage());
		return  new ResponseEntity<String>("No value is present ,Please check your request",HttpStatus.NOT_FOUND);
	
	}
	
	
} 
