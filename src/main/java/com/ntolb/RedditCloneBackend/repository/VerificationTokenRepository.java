package com.ntolb.RedditCloneBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntolb.RedditCloneBackend.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

}
