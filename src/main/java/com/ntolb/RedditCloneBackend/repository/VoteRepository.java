package com.ntolb.RedditCloneBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntolb.RedditCloneBackend.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

}
