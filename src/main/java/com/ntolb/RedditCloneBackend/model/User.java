package com.ntolb.RedditCloneBackend.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@NotBlank(message="Unique user ID is required.")
	private String username;
	@NotBlank(message="Encrypted password is required.")
	private String password;
	@NotBlank(message="User's first and last name are required.")
	private String fName;
	@NotBlank(message="User's first and last name are required.")
	private String lName;
	@Email
	@NotEmpty(message="Valid email address is required.")
	private String email;
	private Instant createdDate;
	private boolean enabled;
}
