package com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Flights;

@Repository
@Transactional

public interface FlightsRepository extends JpaRepository<Flights,Integer>  {

	@Modifying
	@Query(value="DELETE FROM Flights where flight_number=:flightNumber")
	 void deleteByflight_number(Integer flightNumber);
	

}
