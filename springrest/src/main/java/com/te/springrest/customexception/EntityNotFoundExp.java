package com.te.springrest.customexception;

public class EntityNotFoundExp extends RuntimeException{

	public EntityNotFoundExp(String msg) {
		super(msg);
	}
}

