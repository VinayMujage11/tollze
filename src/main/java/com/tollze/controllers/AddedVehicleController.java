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
import com.tollze.entities.VehicleDetailsAsPerUser;
import com.tollze.repositories.TollBookRepository;
import com.tollze.repositories.VehiclesAsPerUserRepository;

@RestController
public class AddedVehicleController {
	@Autowired
	public VehiclesAsPerUserRepository vehiclesasperuserrepo;
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/AddedVehicle/{userId}")
	public List tollHistory(@PathVariable("userId") String userId) 
	{
		
			return vehiclesasperuserrepo.findByuserId(userId);
		
	}
}