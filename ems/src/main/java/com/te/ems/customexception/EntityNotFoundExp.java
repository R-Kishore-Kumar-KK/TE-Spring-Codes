package com.te.ems.customexception;

public class EntityNotFoundExp extends RuntimeException{

	public EntityNotFoundExp(String msg) {
		super(msg);
	}
}
