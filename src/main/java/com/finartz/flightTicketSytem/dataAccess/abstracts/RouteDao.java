package com.finartz.flightTicketSytem.dataAccess.abstracts;

import java.util.List;
import java.util.Map;

import com.finartz.flightTicketSytem.entities.concretes.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finartz.flightTicketSytem.entities.concretes.Route;

public interface RouteDao extends JpaRepository<Route, String>{
	List<Route> getBylanding(String landing);
	List<Route> getByAirlineCompany_CompanyName(String companyName);
}
