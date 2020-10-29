package com.ntolb.RedditCloneBackend.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AuthServiceUnitTest {
	
	@Autowired 
	private AuthService authService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void signup_01_newUser_properties_set_to_expected_values() {
		fail("Not yet implemented");
	}
	
	@Test
	void signup_02_newUser_obj_is_written_to_db() {
		fail("Not yet implemented");
	}
	
	@Test
	void signup_03_newUser_obj_is_written_to_db() {
		fail("Not yet implemented");
	}
	
	@Test
	void signup_04_newUser_obj_is_written_to_db() {
		fail("Not yet implemented");
	}

}
