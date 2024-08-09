package com.tollze.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tollze.entities.TollTaxData;

public interface TollTaxDataRepository extends JpaRepository<TollTaxData, String> {
	public TollTaxData findByvehicleType(String vehicleType);

}
