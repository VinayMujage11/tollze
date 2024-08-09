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

import com.tollze.entities.BookToll;
import com.tollze.entities.User;
import com.tollze.repositories.TollBookRepository;
import com.tollze.repositories.UserRepository;

@RestController
public class AdminTollHistoryController {
	
	@Autowired
	public TollBookRepository tollBookRepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetTollBookDatas")
	public List getTollBookDatas() 
	{
		
			 return tollBookRepo.findAll();
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/DeleteToll/{tollBookId}")
	public void deleteUser(@PathVariable("tollBookId") String tollBookId) 
	{
		BookToll booktoll = tollBookRepo.findBytollBookId(tollBookId);
		tollBookRepo.delete(booktoll);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetTollBookData/{tollBookId}")
	public BookToll getTollBookData(@PathVariable("tollBookId") String tollBookId) 
	{
		return tollBookRepo.findBytollBookId(tollBookId);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/UpdateTollBookData/{tollBookId}")
	public BookToll updateTollData(@PathVariable("tollBookId") String tollBookId ,@RequestBody BookToll booktoll) 
	{
		
			 return tollBookRepo.save(booktoll);
		
	}

}
