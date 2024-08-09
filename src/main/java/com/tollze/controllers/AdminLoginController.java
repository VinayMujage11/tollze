package com.tollze.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.AdminDetails;
import com.tollze.entities.AdminLoginCredentials;
import com.tollze.repositories.AdminDetailsRepository;

@RestController
public class AdminLoginController {
	@Autowired
	public AdminDetailsRepository admindetailsrepo;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/AdminLogin")
	public AdminDetails loginUser(@RequestBody AdminLoginCredentials lc1) 
	{
		try{
			AdminDetails admin = admindetailsrepo.findByadminId(lc1.getAdminId());
			String passadmin = admin.getPassword();
			String passlc1 = lc1.getPassword();
			if(passadmin.equals(passlc1))
			{
				return admin;
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
