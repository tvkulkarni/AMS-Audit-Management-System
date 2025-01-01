package com.cognizant.pojo;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 			This class is used as a response of error handling message.
 *          It will be shown to the user whenever any kind of exception occurs. 
 */

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorResponse {

	
	private LocalDateTime timestamp;
	private HttpStatus status;
	private String reason;
	private String message;
}
