package com.ntolb.RedditCloneBackend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Tag("model")
@Tag("unitTests")
@Tag("")
@Slf4j
public class UserUnitTests {
	
	User mockUser1_noArgs;
	User mockUser2_allArgs;
	
	@BeforeAll
	public static void init() {
		
	}
	
	@Disabled
	@BeforeEach
	public void testScopedInit() {
		if (mockUser1_noArgs.equals(null)) {
			mockUser1_noArgs = new User();
		}else {
			mockUser1_noArgs = null;
			mockUser1_noArgs = new User();
		}
		
		if (mockUser2_allArgs.equals(null)) {
			mockUser2_allArgs = new User();
		}else {
			mockUser2_allArgs = null;
			mockUser2_allArgs = new User();
		}
		
		User mockUser002_allArgsUser = new User("ntolb_01", "123456", "Nate", "Tolbert", "ntolbertu85@gmail.com", Instant.now(),true );
	}
	
	@Tag("unit test")
	@Tag("validation test")
	@Test
	public void User_Test_02_validation_test() {
		assertNotNull(mockUser2_allArgs);
		assertEquals("ntolb_01", mockUser2_allArgs.getUsername());
	}
	
	@Test
	public void UserTest_02_ConstructorInjectionConfirmationTest() {
	//Ensure all properties are injected via all-args-const. 
	assertNull(mockUser1_noArgs.getUsername());
	assertNull(mockUser1_noArgs.getPassword());
	assertNull(mockUser1_noArgs.getFName());
	assertNull(mockUser1_noArgs.getLName());
	assertNull(mockUser1_noArgs.getEmail());
	
	//Ensure all properties remain null via all-args-const.
	assertNotNull(mockUser2_allArgs.getUsername());
	assertNotNull(mockUser2_allArgs.getPassword());
	assertNotNull(mockUser2_allArgs.getFName());
	assertNotNull(mockUser2_allArgs.getLName());
	assertNotNull(mockUser2_allArgs.getEmail());
	}
	
	@Disabled
	@Test
	public void UserTest_03() {
		
	}
	
	@Disabled
	@Test
	public void UserTest_04() {
		
	}
	
	@Disabled
	@Test
	public void UserTest_05() {
		
	}
	
	@Disabled
	@Test
	public void UserTest_06() {
		
	}

}
