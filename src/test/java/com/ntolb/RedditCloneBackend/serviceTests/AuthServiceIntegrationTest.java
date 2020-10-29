package com.ntolb.RedditCloneBackend.serviceTests;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;
import com.ntolb.RedditCloneBackend.model.User;
import com.ntolb.RedditCloneBackend.repository.UserRepository;
import com.ntolb.RedditCloneBackend.repository.VerificationTokenRepository;
import com.ntolb.RedditCloneBackend.service.AuthService;
import com.ntolb.RedditCloneBackend.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceIntegrationTest {

	@Mock
	RegisterRequest request; 
	@Mock
	User user;
	@Autowired 
	private AuthService service;
	
	@BeforeEach
	void init(AuthService service) {
		
	}
	
	
	
	@Test
	public void testSignup() {
		 //Verify that Signup method moves req data to new user object
		
		
		
		//when(calcService.add(20.0,10.0)).thenReturn(30.0);
	}
	
}
