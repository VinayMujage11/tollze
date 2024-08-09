package com.tollze.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.LoginCredentials;
import com.tollze.entities.User;
import com.tollze.entities.VehicleDetailsAsPerUser;
import com.tollze.repositories.UserRepository;
import com.tollze.repositories.VehiclesAsPerUserRepository;

@RestController
public class VehiclesController {
	@Autowired
	public VehiclesAsPerUserRepository vehiclesasperuserrepo ;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/AddVehicle")
	public void addVehicle(@RequestBody VehicleDetailsAsPerUser v) {
		System.out.println(v);
		vehiclesasperuserrepo.save(v);
	}

}
