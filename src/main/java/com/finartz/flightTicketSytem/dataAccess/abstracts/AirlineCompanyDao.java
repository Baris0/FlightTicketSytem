package com.finartz.flightTicketSytem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finartz.flightTicketSytem.entities.concretes.AirlineCompany;

public interface AirlineCompanyDao extends JpaRepository<AirlineCompany, String>{
	List<AirlineCompany> getBycompanyName(String companyName);
}
