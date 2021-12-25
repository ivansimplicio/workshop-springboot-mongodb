package com.dev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dev.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}