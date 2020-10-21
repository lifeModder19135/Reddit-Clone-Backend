package com.ntolb.RedditCloneBackend.serviceTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceIntegrationTest {

	@Mock
	RegisterRequest request;
	
	@Test
	public void testSignup() {
		
	}
	
}
