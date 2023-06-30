package com.pack.exception;

public class UserNotFouneException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public UserNotFouneException(String msg)
	{
		super(msg);
	}
}
