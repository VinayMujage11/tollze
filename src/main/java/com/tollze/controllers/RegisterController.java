package com.tollze.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;


import com.tollze.entities.User;
import com.tollze.repositories.UserRepository;

@RestController
public class RegisterController {
	@Autowired
	public UserRepository userRepository;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/AddUser")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
