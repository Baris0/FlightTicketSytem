package com.finartz.flightTicketSytem.business.concretes;

import java.util.List;

import com.finartz.flightTicketSytem.entities.concretes.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finartz.flightTicketSytem.business.abstracts.AirlineCompanyService;
import com.finartz.flightTicketSytem.dataAccess.abstracts.AirlineCompanyDao;
import com.finartz.flightTicketSytem.entities.concretes.AirlineCompany;

@Service
public class AirlineCompanyManager implements AirlineCompanyService{

	private AirlineCompanyDao airlineCompanyDao;
	
	@Autowired
	public AirlineCompanyManager(AirlineCompanyDao airlineCompanyDao) {
		this.airlineCompanyDao = airlineCompanyDao;
	}
	
	
	@Override
	public List<AirlineCompany> getAll() {
		return this.airlineCompanyDao.findAll();
	}

	@Override
	public List<AirlineCompany> getBycompanyName(String companyName) {
		return airlineCompanyDao.getBycompanyName(companyName);
	}


	@Override
	public AirlineCompany add(AirlineCompany airlineCompany) {
		return this.airlineCompanyDao.save(airlineCompany);
	}

}
