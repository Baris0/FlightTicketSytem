package com.finartz.flightTicketSytem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finartz.flightTicketSytem.business.abstracts.AirportService;
import com.finartz.flightTicketSytem.dataAccess.abstracts.AirportDao;
import com.finartz.flightTicketSytem.entities.concretes.Airport;

@Service
public class AirportManager implements AirportService{

	private AirportDao airportDao;
	
	@Autowired
	public AirportManager(AirportDao airportDao) {
		this.airportDao = airportDao;
	}
	
	@Override
	public Airport add(Airport airport) {
		return airportDao.save(airport);
	}

	@Override
	public List<Airport> getAll() {
		return airportDao.findAll();
	}

	@Override
	public List<Airport> getByairportName(String airportName) {
		return this.airportDao.getByairportName(airportName);
	}

}
