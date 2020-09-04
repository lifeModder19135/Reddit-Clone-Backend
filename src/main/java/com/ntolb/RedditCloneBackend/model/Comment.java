package com.ntolb.RedditCloneBackend.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotEmpty(message="Comment text cannot be empty.")
	private String text;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="postId", referencedColumnName="postId")
	private Post post;
	private Instant createdDate;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="username", referencedColumnName="username")
	private User user;

}
