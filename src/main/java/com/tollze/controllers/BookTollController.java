package com.tollze.controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.BookToll;
import com.tollze.entities.FromCityToCity;
import com.tollze.entities.TollTaxData;
import com.tollze.repositories.FromCityToCityRepository;
import com.tollze.repositories.TollBookRepository;
import com.tollze.repositories.TollTaxDataRepository;

@RestController
public class BookTollController {
	@Autowired
	public TollBookRepository tollBookrepository;
	@Autowired
	public TollTaxDataRepository tollTaxDataRepo;
	@Autowired
	public FromCityToCityRepository fromCityToCityRepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/BookToll")
	public BookToll bookToll(@RequestBody BookToll booktoll) 
	{
		int count= (int) (Math.random() * 100000);
		String s = "Tollz-E" + count;
		booktoll.setTollBookId(s);
		
		String s1 = booktoll.getSource();
		String s2 = booktoll.getDestination();
		FromCityToCity f =fromCityToCityRepo.findBySourceAndDestinationOrDestinationAndSource(s1, s2, s2, s1);
		booktoll.setDistanceInKM(f.getDistanceInKM());
		
		TollTaxData t = tollTaxDataRepo.findByvehicleType(booktoll.getVehicleType());
		booktoll.setAmountToBePaid((f.getDistanceInKM())*(t.getTollTaxPerKM()));
		
		booktoll.setPaymentStatus("Unpaid");
		
		tollBookrepository.save(booktoll);
		
		return (tollBookrepository.findBytollBookId(s));
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetVehicleTypes")
	public List getVehicleTypes() {
		return tollTaxDataRepo.findAll();
	}
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@PutMapping("/updateToll/{id}")
//	public String GetAmount(@PathVariable("id") String id , @RequestBody BookToll booktoll) 
//	{
////		BookToll updateBookToll = tollBookrepository.updateBookToll(id, booktoll);
////		if(updateBookToll != null ) {
////			return "Toll Booked";
////		}
////		else {
////			return "Unable to Book Toll";
////		}
////		Date date = Date.valueOf(LocalDate.now());
////		booktoll.setDateOfbooking(date);
////		
////		LocalDate date2 =  (booktoll.getDateofjourney()).toLocalDate();
////		
////		
////		
////		booktoll.setDateOfExpiry(Date.valueOf(date2.plusDays(1)));
////		
////		tollBookrepository.findBytollBookId(id).setPaymentStatus("Paid");
////		tollBookrepository.findBytollBookId(id).setAmountToBePaid(booktoll.getAmountToBePaid());
////		tollBookrepository.findBytollBookId(id).setDateOfbooking(booktoll.getDateOfbooking());
////		tollBookrepository.findBytollBookId(id).setDateOfExpiry(booktoll.getDateOfExpiry());
//		if(tollBookrepository.findBytollBookId(id) != null) {
//			booktoll.setPaymentStatus("paid");
//			Date date = Date.valueOf(LocalDate.now());
//			booktoll.setDateOfbooking(date);
//			LocalDate date2 =  (booktoll.getDateofjourney()).toLocalDate();
//			
//			booktoll.setDateOfExpiry(Date.valueOf(date2.plusDays(1)));
//			tollBookrepository.save(booktoll);
//		}
//		
//		
//		return "toll booked";
//	}
}
