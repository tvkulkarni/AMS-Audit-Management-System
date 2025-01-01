package com.cts.benchmark.service;
/**
 *  This interface communicates with Auth microservice to check validity of the token and thus validates the user.
 *  Below method return true/false	 
 */
public interface TokenService {
	
	Boolean checkTokenValidity(String token);

}
