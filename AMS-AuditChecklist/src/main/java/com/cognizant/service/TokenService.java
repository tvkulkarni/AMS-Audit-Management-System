package com.cognizant.service;

/**
 * This is an interface which contacts the Authentication microservice to check validity of the token.
 */
public interface TokenService {

	Boolean checkTokenValidity(String token);

}
