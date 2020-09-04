package com.ntolb.RedditCloneBackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntolb.RedditCloneBackend.dto.RegisterRequest;
import com.ntolb.RedditCloneBackend.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@PostMapping("/signup")
	public void signup(@RequestBody RegisterRequest registerRequest) {
			
		AuthService service = new AuthService();
		service.signup(registerRequest);		
	}
	
}
