package com.ntolb.RedditCloneBackend.service;

import org.springframework.stereotype.Service;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.*;

import com.ntolb.RedditCloneBackend.exception.ActivationEmailException;
import com.ntolb.RedditCloneBackend.model.NotificationEmail;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class MailService {
	
	private final JavaMailSender sender;
	private final NotificationEmailBuilder builder;
	
	void sendNotificationEmail(NotificationEmail email) {
		MimeMessagePreparator messagePrep = mimeMessage -> {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
			helper.setFrom("mailer@mailservice.com");
			helper.setTo(email.getRecipient());
			helper.setSubject(email.getSubject());
			helper.setText(builder.build(email.getBody()));
		};
		try {
			sender.send(messagePrep);
			log.info("SUCCESS: Activation Email sent to "+ email.getRecipient());
		}catch (MailException e) {
			throw new ActivationEmailException(
					"!ERROR!: Exception occured while sending activation email to "+email.getRecipient()
					);
		}
	}

}
