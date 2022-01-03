package com.finartz.flightTicketSytem.business.abstracts;

import java.util.List;

import com.finartz.flightTicketSytem.entities.concretes.Airport;

public interface AirportService {
	
	Airport add(Airport airport);
	List<Airport> getAll();
	List<Airport> getByairportName(String airportName);

}
