package com.cognizant.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomErrorResponse {
	
	private LocalDateTime timestamp;
	
	private HttpStatus status;
	
	private String reason;
	
	private String message;

}
