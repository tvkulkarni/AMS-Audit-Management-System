package com.cognizant.exception;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognizant.model.CustomErrorResponse;

import lombok.extern.slf4j.Slf4j;


@RestControllerAdvice @Slf4j
public class GlobalErrorHandler {
	
	@Autowired
	Environment env;

	/**
	 * This method will handle  login failed exception
	 */
	
	@ExceptionHandler(LoginFailedException.class)
	public ResponseEntity<CustomErrorResponse> handleIdNotFoundexception(LoginFailedException ex)
	{
		log.info(env.getProperty("string.start"));
		CustomErrorResponse response=new CustomErrorResponse(LocalDateTime.now(), HttpStatus.NOT_FOUND,
				env.getProperty("string.reason.loginfail"), ex.getMessage());
		log.info(env.getProperty("string.end"));
		return new ResponseEntity<CustomErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	/**
	 * This method will handle  login failed exception
	 */
	@ExceptionHandler(TokenExpiredException.class)
	public ResponseEntity<CustomErrorResponse> handleTokenNotFoundexception(TokenExpiredException ex)
	{
		log.info(env.getProperty("string.start"));
		CustomErrorResponse response=new CustomErrorResponse(LocalDateTime.now(), HttpStatus.NOT_FOUND,
				env.getProperty("string.not.valid"), ex.getMessage());
		log.info(env.getProperty("string.end"));
		return new ResponseEntity<CustomErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	/**
	 * This method will handle user not found exception
	 */
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleUserNotFoundexception(UsernameNotFoundException ex)
	{
		log.info(env.getProperty("string.start"));
		CustomErrorResponse response=new CustomErrorResponse(LocalDateTime.now(), HttpStatus.NOT_FOUND,
				env.getProperty("string.reason.loginfail"), ex.getMessage());
		log.info(env.getProperty("string.end"));
		return new ResponseEntity<CustomErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
}
