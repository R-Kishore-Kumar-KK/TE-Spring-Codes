package com.te.springrest.customexception;

public class EmployeeException extends RuntimeException{

	public EmployeeException(String msg) {
		super(msg);
	}
}