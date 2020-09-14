package com.springboot.service;

import java.util.List;

import com.springboot.document.User;

public interface UserService {

	public User addUser(User user);
	public User getUser(String userId);
	public List<User> getAllUsers();

}
