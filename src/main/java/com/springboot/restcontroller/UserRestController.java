package com.springboot.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.document.User;
import com.springboot.service.UserService;

@RestController
@RequestMapping(value = "/api/rest")
public class UserRestController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User addNewUsers(@Valid @RequestBody User user) {
		LOG.info("Saving user.");
		return userService.addUser(user);
	}// http://localhost:8082/user

	/*
	 * { "userId": "1", "name" : "Shubham", "userSettings" : { "bike" : "pulsar" } }
	 */

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		LOG.info("Getting all users.");
		List<User> userList = userService.getAllUsers();
		return userList;
	}// http://localhost:8082/users

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable String userId) {
		LOG.info("Getting user with ID: {}.", userId);
		User user = userService.getUser(userId);
		return user;
	}

}
