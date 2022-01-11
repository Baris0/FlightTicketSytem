package com.finartz.flightTicketSytem.api.controller;

import java.util.List;

import com.finartz.flightTicketSytem.entities.concretes.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finartz.flightTicketSytem.business.abstracts.AirlineCompanyService;
import com.finartz.flightTicketSytem.entities.concretes.AirlineCompany;

@RestController
@RequestMapping("/api/airlinecompanys/")
public class AirlineCompanyController {
	
	private AirlineCompanyService airlineCompanyService;
	
	@Autowired
	public AirlineCompanyController(AirlineCompanyService airlineCompanyService) {
		this.airlineCompanyService = airlineCompanyService;
	}
	
	@PostMapping("add")
	public AirlineCompany add(@RequestBody AirlineCompany airlineCompany) {
		return this.airlineCompanyService.add(airlineCompany);
	}
	
	@GetMapping("getall")
	public List<AirlineCompany> getAll(){
		return this.airlineCompanyService.getAll();
	}
	
	@GetMapping("getcompanyname")
	public List<AirlineCompany> getBycompanyName(@RequestParam String companyName){
		return this.airlineCompanyService.getBycompanyName(companyName);
	}

}
