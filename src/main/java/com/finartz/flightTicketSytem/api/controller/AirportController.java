package com.finartz.flightTicketSytem.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finartz.flightTicketSytem.business.abstracts.AirportService;
import com.finartz.flightTicketSytem.entities.concretes.Airport;

@RestController
@RequestMapping("/api/airports/")
public class AirportController {

	private AirportService airportService;
	
	@Autowired
	public AirportController(AirportService airportService) {
		this.airportService = airportService;
	}
	
	@GetMapping("getall")
	public List<Airport> getAll(){
		return this.airportService.getAll();
	}
	
	@PostMapping("add")
	public Airport add(@RequestBody Airport airport) {
		return this.airportService.add(airport);
	}
	
	@GetMapping("getairportname")
	public List<Airport> getBycity(@RequestParam String airportName){
		return this.airportService.getByairportName(airportName);
	}
	
}
