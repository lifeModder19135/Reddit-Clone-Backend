package com.ntolb.RedditCloneBackend.service;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;
import com.ntolb.RedditCloneBackend.model.User;

@Service
public class AuthService {
	
	public void signup(RegisterRequest request) {
		User newUser = new User();
		newUser.setUsername(request.getUsername());
		newUser.setEmail(request.getEmail());
		newUser.setPassword(request.getPassword());
		newUser.setCreatedDate(Instant.now()) ;
		newUser.setEnabled(false);
	}
	
	public AuthService() {
		
	}
	
}
