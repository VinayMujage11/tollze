package com.tollze.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.User;
import com.tollze.repositories.UserRepository;
@RestController
public class LoginController {
	@Autowired
	public UserRepository userRepository;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/Login")
	public String registerUser(@RequestBody User user) 
	{
		User user1 = userRepository.findByEmail(user.getEmail());
		if((user1.getPassword()).equals(user.getPassword()) == true) 
		{
			return "successful";
		}
		else {
			return "unsuccessful";
		}
	}
}
