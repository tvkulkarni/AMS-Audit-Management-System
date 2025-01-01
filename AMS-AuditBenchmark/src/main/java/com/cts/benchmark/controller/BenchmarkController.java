package com.cts.benchmark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.benchmark.feignclient.AuthClient;
import com.cts.benchmark.pojo.AuditBenchmark;
import com.cts.benchmark.service.TokenService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class BenchmarkController {
	@Autowired
	AuthClient authClient;
		
	@Autowired
	TokenService tokenService;
	
	@Autowired
	Environment env;
	
	/*
	 * This is used to get benchmark value for an Audit Type and thus return a List
	 */
	@GetMapping("/AuditBenchmark")
	public ResponseEntity<?> getBenchmarkMap(@RequestHeader("Authorization") String token){
		List<AuditBenchmark> auditBenchmarkList = new ArrayList<AuditBenchmark>();
		ResponseEntity<?> responseEntity=null;
		AuditBenchmark ab1=new AuditBenchmark("Internal", 3);
		AuditBenchmark ab2=new AuditBenchmark("SOX", 1);		
		auditBenchmarkList.add(ab1);
		auditBenchmarkList.add(ab2);
		/*
		 * Here we will check the validity of the token and if token is valid then only we will return the list
		 */
		if(tokenService.checkTokenValidity(token)) {
			
			responseEntity = new ResponseEntity<List<AuditBenchmark>>(auditBenchmarkList,HttpStatus.OK);
		}else {
			log.error(env.getProperty("string.token.exp")); 
			log.info("End of Audit Benchmark In Else block");

			responseEntity= new ResponseEntity<String>(env.getProperty("string.token.exp"),HttpStatus.FORBIDDEN);
			return responseEntity;
		}
		return responseEntity;

	}
}