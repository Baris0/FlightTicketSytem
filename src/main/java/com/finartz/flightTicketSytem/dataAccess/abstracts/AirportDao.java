package com.finartz.flightTicketSytem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finartz.flightTicketSytem.entities.concretes.Airport;

public interface AirportDao extends JpaRepository<Airport, String>{
	List<Airport> getByairportName(String airportName);	
}
