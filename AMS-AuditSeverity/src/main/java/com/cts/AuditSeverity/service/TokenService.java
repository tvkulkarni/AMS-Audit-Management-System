package com.cts.AuditSeverity.service;
/** 
 * 			This interface communicates with Auth microservice to check validity of the
 *          token. 
 */
public interface TokenService {
	/*
	 * This has only one method to check the validity
	 */
	Boolean checkTokenValidity(String token);

}
