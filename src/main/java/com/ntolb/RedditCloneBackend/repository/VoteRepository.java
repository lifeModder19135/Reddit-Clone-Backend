package com.ntolb.RedditCloneBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntolb.RedditCloneBackend.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
