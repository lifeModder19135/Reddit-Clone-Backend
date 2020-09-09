package com.ntolb.RedditCloneBackend.model;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {
	
		private String subject;
		private String recipient;
		private String body;

}
