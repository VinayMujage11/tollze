package com.tollze.controllers;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.BookToll;
import com.tollze.repositories.TollBookRepository;


@RestController
public class ConfirmTollController {
	@Autowired
	public TollBookRepository tollBookrepository;
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/updateToll/{id}")
	public String GetAmount(@PathVariable("id") String id , @RequestBody BookToll booktoll) 
	{
//		BookToll updateBookToll = tollBookrepository.updateBookToll(id, booktoll);
//		if(updateBookToll != null ) {
//			return "Toll Booked";
//		}
//		else {
//			return "Unable to Book Toll";
//		}
//		Date date = Date.valueOf(LocalDate.now());
//		booktoll.setDateOfbooking(date);
//		
//		LocalDate date2 =  (booktoll.getDateofjourney()).toLocalDate();
//		
//		
//		
//		booktoll.setDateOfExpiry(Date.valueOf(date2.plusDays(1)));
//		
//		tollBookrepository.findBytollBookId(id).setPaymentStatus("Paid");
//		tollBookrepository.findBytollBookId(id).setAmountToBePaid(booktoll.getAmountToBePaid());
//		tollBookrepository.findBytollBookId(id).setDateOfbooking(booktoll.getDateOfbooking());
//		tollBookrepository.findBytollBookId(id).setDateOfExpiry(booktoll.getDateOfExpiry());
		if(tollBookrepository.findBytollBookId(id) != null) {
			booktoll.setPaymentStatus("paid");
			Date date = Date.valueOf(LocalDate.now());
			booktoll.setDateOfbooking(date);
			LocalDate date2 =  (booktoll.getDateofjourney()).toLocalDate();
			
			booktoll.setDateOfExpiry(Date.valueOf(date2.plusDays(1)));
			tollBookrepository.save(booktoll);
		}
		
		
		return "toll booked";
	}

}
