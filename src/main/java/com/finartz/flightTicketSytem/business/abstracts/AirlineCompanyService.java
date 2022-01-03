package com.finartz.flightTicketSytem.business.abstracts;

import java.util.List;

import com.finartz.flightTicketSytem.entities.concretes.AirlineCompany;

public interface AirlineCompanyService {
	List<AirlineCompany> getAll();
	List<AirlineCompany> getBycompanyName(String companyName);
	AirlineCompany add(AirlineCompany airlineCompany);
}
