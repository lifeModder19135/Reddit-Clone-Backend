package com.ntolb.RedditCloneBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

	private String username;
	private String fName;
	private String lName;
	private String email;
	private String password;
	
}
