package com.tollze.controllers;


import java.util.ArrayList;
import java.util.List;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.BookToll;
import com.tollze.repositories.TollBookRepository;

@RestController
public class TollHistoryController {
	@Autowired
	public TollBookRepository tollbookrepo;
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/TollHistory/{userId}")
	public List tollHistory(@PathVariable("userId") String userId) 
	{
//	    List<BookToll> listbooktolls =  tollbookrepo.findAll();
//	    ArrayList<BookToll> list = new ArrayList<BookToll>();
//	    for(BookToll b : listbooktolls) {
//	    	String s = (b.getUserId()).trim().toLowerCase();
//	    	String s2 = userId.trim().toLowerCase();
//	    	if(s.equals(s2)) {
//	    		list.add(b);
//	    	}
//	    }
		return tollbookrepo.findByuserId(userId);
	}
}
