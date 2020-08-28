package com.ntolb.RedditCloneBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntolb.RedditCloneBackend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
