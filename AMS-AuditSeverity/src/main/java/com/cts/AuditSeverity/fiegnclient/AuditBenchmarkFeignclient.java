package com.cts.AuditSeverity.fiegnclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.AuditSeverity.pojo.AuditBenchmark;
@FeignClient(url="${fos.auditbenchmark}",name="audit-benchmark")
/*
 * Here url of Audit Benchmark Microservice is used in order to get the benchmark values according to the audit type.
 */
public interface AuditBenchmarkFeignclient {

	@GetMapping("/AuditBenchmark")
	public ResponseEntity<List<AuditBenchmark>> getBenchmarkMap(@RequestHeader("Authorization") String token);
}
