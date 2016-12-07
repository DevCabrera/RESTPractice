package com.rsquared.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsquared.entities.User;
import com.rsquared.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	
	public User createUser(User user) {
		return userService.createNewUser(user);
	}
	
}
