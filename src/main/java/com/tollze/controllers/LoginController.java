package com.tollze.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.LoginCredentials;
import com.tollze.entities.User;
import com.tollze.repositories.UserRepository;
@RestController
public class LoginController {
	@Autowired
	public UserRepository userRepository;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/Login")
	public User loginUser(@RequestBody LoginCredentials lc1) 
	{
		try{
			User user = userRepository.findByEmail(lc1.getEmail());
			String passuser = user.getPassword();
			String passlc1 = lc1.getPassword();
			if(passuser.equals(passlc1))
			{
				return user;
			}
			else {
				return null;
			}
		}
		catch(Exception e) {
			return null;
		}
	}
}
