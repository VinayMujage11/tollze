package com.tollze.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.TollTaxData;
import com.tollze.repositories.TollTaxDataRepository;

@RestController
public class TollTaxDataController {
	@Autowired
	public TollTaxDataRepository tollTaxDataRepo;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/AddTollTax")
	public void addTollTax(@RequestBody TollTaxData t) 
	{
		
			 tollTaxDataRepo.save(t);
		
	}

	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetTollTax")
	public List getTollTax() 
	{
		
			 return tollTaxDataRepo.findAll();
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/DeleteTollTaxData/{vehicleType}")
	public void deleteTollTax(@PathVariable("vehicleType") String vehicleType) 
	{
		
		tollTaxDataRepo.deleteById(vehicleType);
		
	}
}
