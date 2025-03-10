package com.devsuperior.dscommerce.services.exceptions;

public class ForbiddenException extends RuntimeException{

	private static final long serialVersionUID = 416862018817291805L;

	public ForbiddenException(String msg) {
		super(msg);
	}
	
}
