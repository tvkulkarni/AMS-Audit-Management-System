package com.cognizant.exception;

public class TokenExpiredException extends Exception{

	/**
	 * @version 1.8
	 * 			This class is used for handling exception. When the token
	 *          expires then this exception will be thrown. 
	 *
	 */
	private static final long serialVersionUID = 1L;
    public TokenExpiredException(String message)
    {
    	super(message);
    }
}
