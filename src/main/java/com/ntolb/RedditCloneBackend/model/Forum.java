package com.ntolb.RedditCloneBackend.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Forum {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotBlank(message="Forum name is required")
	private String name;
	@NotBlank(message="Forum description is required")
	private String description;
	@OneToMany(fetch=FetchType.LAZY)
	private List<Post> posts;
	private Instant createdDate;
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;

}
