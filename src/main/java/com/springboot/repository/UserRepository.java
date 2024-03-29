package com.springboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	public List<User> findByName(String name);
}
