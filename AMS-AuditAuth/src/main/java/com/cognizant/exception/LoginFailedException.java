package com.cognizant.exception;

import lombok.NoArgsConstructor;

/**
 This class is used for handling exception. When the user provides
 *          wrong credentials then this exception will be thrown.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
public class LoginFailedException extends RuntimeException {

	public LoginFailedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LoginFailedException(Throwable cause) {
		super(cause);
	}

	public LoginFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
