package com.cts.AuditSeverity.pojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.AuditSeverity.pojo.AuditType;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
public class AuditTypeTest {

	AuditType auditType = new AuditType();
	
	@Mock
	Environment env;
	
	@Test
	public void testAuditTypeAllConstructor() {
		log.info(env.getProperty("string.start"));
		AuditType type = new AuditType("abc");
		assertEquals(type.getAuditType(), "abc");
		log.info(env.getProperty("string.end"));
	}
	
	@Test
	public void testGetAuditType() {
		log.info(env.getProperty("string.start"));
		auditType.setAuditType("abc");
		assertEquals(auditType.getAuditType(), "abc");
		log.info(env.getProperty("string.end"));
	}
	
	
	@Test
	public void testoString() {
		log.info(env.getProperty("string.start"));
		String string = auditType.toString();
		assertEquals(auditType.toString(), string);
		log.info(env.getProperty("string.end"));
	}

}
