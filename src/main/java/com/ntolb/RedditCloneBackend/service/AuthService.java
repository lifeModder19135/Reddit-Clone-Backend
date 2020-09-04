package com.ntolb.RedditCloneBackend.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;
import com.ntolb.RedditCloneBackend.model.User;

@Service
public class AuthService {
	
	@Autowired
	private PasswordEncoder encoder;
	
	public void signup(RegisterRequest request) {
		User newUser = new User();
		newUser.setUsername(request.getUsername());
		newUser.setEmail(request.getEmail());
		newUser.setPassword(encoder.encode(request.getPassword()));
		newUser.setCreatedDate(Instant.now()) ;
		newUser.setEnabled(false);
	}
	
	public AuthService() {
		
	}
	
}
