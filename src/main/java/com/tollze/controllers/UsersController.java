package com.tollze.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.User;
import com.tollze.repositories.UserRepository;


@RestController
public class UsersController {
	@Autowired
	public UserRepository userrepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetUsers")
	public List getUsers() 
	{
		
			 return userrepo.findAll();
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetUser/{userId}")
	public User getUser(@PathVariable("userId") String userId ) 
	{
		
			 return userrepo.findByUserId(userId);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/UpdateUser/{userId}")
	public User updateUser(@PathVariable("userId") String userId ,@RequestBody User user) 
	{
		
			 return userrepo.save(user);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/DeleteUser/{userId}")
	public void deleteUser(@PathVariable("userId") String userId) 
	{
		User user = userrepo.findByUserId(userId);
		userrepo.delete(user);
		
	}
}
