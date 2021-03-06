package com.ntolb.RedditCloneBackend.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long postId;
	@NotBlank(message="This field cannot be empty or null.")
	private String postName;
	@Nullable
	private String url;
	@Nullable
	@Lob
	private String description;
	private Integer voteCount;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="username", referencedColumnName="username")
	private User user;
	private Instant createdDate;
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id", referencedColumnName="id")
	private Forum forum;

}
