package com.tollze.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tollze.entities.AdminDetails;
import com.tollze.entities.NewAdmin;
import com.tollze.entities.User;
import com.tollze.repositories.AdminDetailsRepository;

@RestController
public class AdminsController {
	@Autowired
	public AdminDetailsRepository adminDetailsRepo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetAdmins")
	public List getAdmins() 
	{
		
			 return adminDetailsRepo.findAll();
		
	}

	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/AddAdmin")
	public void addAdmins(@RequestBody NewAdmin newAdmin) 
	{
		int count= (int) (Math.random() * 100000);
		AdminDetails admindetails = new AdminDetails(String.valueOf(count),"PassZe@"+count,newAdmin.getFullName(),newAdmin.getEmail(),"Admin-"+count,newAdmin.getRole(),newAdmin.getUniqueIdentityType(),newAdmin.getUniqueIdentityNumber()) ;
//		admindetails.setAdminId(String.valueOf(count));
//		admindetails.setUserName("Admin-"+count);
//		admindetails.setPassword("PassZe@"+count);
//		admindetails.setEmail(newAdmin.getEmail());
//		admindetails.setFullName(newAdmin.getFullName());
//		admindetails.setUniqueIdentityType(get.)
//		String adminId, String password, String fullName, String email, String userName, String role,
//		String uniqueIdentityType, String uniqueIdentityNumber
			  adminDetailsRepo.save(admindetails);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("UpdateAdmin/{adminId}")
	public AdminDetails editAdmin(@PathVariable("adminId") String adminId ,@RequestBody AdminDetails admindetails) 
	{
		
			 return adminDetailsRepo.save(admindetails);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/GetAdmin/{adminId}")
	public AdminDetails getAdmin(@PathVariable("adminId") String adminId ) 
	{
		
			 return adminDetailsRepo.findByadminId(adminId);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/DeleteAdmin/{adminId}")
	public void deleteAdmin(@PathVariable("adminId") String adminId) 
	{
		AdminDetails admindetails = adminDetailsRepo.findByadminId(adminId);
		adminDetailsRepo.delete(admindetails);
		
	}
}
