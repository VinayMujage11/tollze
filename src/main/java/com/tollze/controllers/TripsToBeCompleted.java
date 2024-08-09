package com.tollze.controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.BookToll;
import com.tollze.repositories.TollBookRepository;

@RestController
public class TripsToBeCompleted {
	@Autowired
	public TollBookRepository tollbookrepo;
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/FutureTrips/{userId}")
	public List tollHistory(@PathVariable("userId") String userId) 
	{
		
//		List list1 = 
//		List<BookToll> list = new ArrayList<BookToll>();
//		Date date = null; 
//		date.valueOf("2024-07-31");
		return tollbookrepo.findByuserIdAndPaymentStatusAndJourneydateGreaterThanEqual(userId, "paid",LocalDate.now());
	}


}
