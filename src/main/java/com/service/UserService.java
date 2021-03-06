package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		User userCreated=userRepository.save(user);
		return userCreated;
	}

	public User getByUserEmailAndPassword(String userEmail, String password) {
		
		User user=userRepository.findByuserEmailAndPassword(userEmail,password).orElse(new User());

		return user;
	}

}
