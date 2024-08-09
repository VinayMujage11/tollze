package com.tollze.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tollze.entities.BookToll;
import com.tollze.entities.VehicleDetailsAsPerUser;

public interface VehiclesAsPerUserRepository extends JpaRepository<VehicleDetailsAsPerUser, String> {
	public  List<VehicleDetailsAsPerUser> findByuserId(String userId);
}
