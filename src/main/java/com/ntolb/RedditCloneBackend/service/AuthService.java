package com.ntolb.RedditCloneBackend.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;
import com.ntolb.RedditCloneBackend.model.User;
import com.ntolb.RedditCloneBackend.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService {
	
	private final PasswordEncoder encoder;
	private final UserRepository userRepository;
	
	public void signup(RegisterRequest request) {
		User newUser = new User();
		newUser.setUsername(request.getUsername());
		newUser.setEmail(request.getEmail());
		newUser.setPassword(encoder.encode(request.getPassword()));
		newUser.setCreatedDate(Instant.now()) ;
		newUser.setEnabled(false);
		userRepository.save(newUser);
	}
	
}
