package com.tollze.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tollze.entities.AdminDetails;
import com.tollze.entities.User;

public interface AdminDetailsRepository extends JpaRepository<AdminDetails,String> {
	public  AdminDetails findByadminId(String adminId);

}
