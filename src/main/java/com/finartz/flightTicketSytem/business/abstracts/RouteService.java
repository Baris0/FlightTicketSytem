package com.finartz.flightTicketSytem.business.abstracts;

import java.util.List;

import com.finartz.flightTicketSytem.entities.concretes.Route;

public interface RouteService {
	Route add(Route route);
	List<Route> getAll();
	List<Route> getBylanding(String landing);
	List<Route> getByAirlineCompany_CompanyName(String companyName);
}
