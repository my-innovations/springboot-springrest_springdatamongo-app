package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserCreationException extends RuntimeException {

	private static final long serialVersionUID = -5114603096058051604L;

	public UserCreationException(String exceMsg) {
		super(exceMsg);
	}
	
	public UserCreationException(String message, Throwable cause) {
		super(message, cause);
	}

}
