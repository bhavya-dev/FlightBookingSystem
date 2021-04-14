package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
//@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		
		 User userCreated= userService.createUser(user);
		 
		 return userCreated;
	}
	
	
	@GetMapping("/getByUserEmailAndPassword/{userEmail}/{password}")
	public User getByUserEmailAndPassword(@PathVariable String userEmail,@PathVariable String password ) {
		
		User user=userService.getByUserEmailAndPassword(userEmail,password);
		
		return user;
		
	}
	
	
	

}
