package com.ntolb.RedditCloneBackend.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NotificationEmailBuilder {
	
	TemplateEngine engine;
	
	public String build(String message) {
		Context context = new Context();
		context.setVariable("message", message);
		return engine.process("mailTemplate", context);
	}

}
