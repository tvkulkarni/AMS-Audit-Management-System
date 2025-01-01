package com.cts.AuditSeverity.pojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.AuditSeverity.pojo.User;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
public class UserTest {

	User loginCredential = new User();
	
	@Mock
	Environment env;
	@Test
	public void testUserLoginCredentialAllConstructor() {
		log.info(env.getProperty("string.start"));
		User credential = new User("abc", "abc");
		assertEquals(credential.getUserId(), "abc");
		log.info(env.getProperty("string.end"));
	}
	
	@Test
	public void testGetUid() {
		log.info(env.getProperty("string.start"));
		loginCredential.setUserId("abc");
		assertEquals(loginCredential.getUserId(), "abc");
		log.info(env.getProperty("string.end"));
	}

	@Test
	public void testUserPassword() {
		log.info(env.getProperty("string.start"));
		loginCredential.setPassword("abc");
		assertEquals(loginCredential.getPassword(), "abc");
		log.info(env.getProperty("string.end"));
	}
	
	@Test
	public void testoString() {
		log.info(env.getProperty("string.start"));
		String string = loginCredential.toString();
		assertEquals(loginCredential.toString(), string);
		log.info(env.getProperty("string.end"));
	}

}
