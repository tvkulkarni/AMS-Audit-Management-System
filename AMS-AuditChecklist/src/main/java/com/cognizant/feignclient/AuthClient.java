package com.cognizant.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import com.cognizant.pojo.AuthResponse;

/**
 * 
 * This class communicates with Authentication microservice to verify the token.
 *
 */


@FeignClient(url = "${fos.auth}", name = "audit-auth")
/*
 * Here we have added the url of authentication microservice
 */
public interface AuthClient {
	
	/**
	 * 
	 * @param String token
	 * @return AuthResponse 
	 * This method helps in validatig the token and thereby authenticates the user.
	 */
	
	@GetMapping(value = "/validate")
	public ResponseEntity<AuthResponse> getValidity(@RequestHeader("Authorization") String token) ;


}

	
