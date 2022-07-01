package com.example.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException() {
		super();
	}
	public UserNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
	public UserNotFoundException(String message) {
		super(message);
	}
	public UserNotFoundException(Throwable cause) {
		super(cause);
	}
}
