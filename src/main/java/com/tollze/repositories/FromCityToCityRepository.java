package com.tollze.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tollze.entities.FromCityToCity;

public interface FromCityToCityRepository extends JpaRepository<FromCityToCity, String> {
	public FromCityToCity findBySourceAndDestinationOrDestinationAndSource(String source1 ,String destination1 ,String source2 ,String destination2);
}
