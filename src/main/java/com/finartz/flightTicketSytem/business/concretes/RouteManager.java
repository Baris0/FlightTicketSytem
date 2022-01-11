package com.finartz.flightTicketSytem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finartz.flightTicketSytem.business.abstracts.RouteService;
import com.finartz.flightTicketSytem.dataAccess.abstracts.RouteDao;
import com.finartz.flightTicketSytem.entities.concretes.Route;

@Service
public class RouteManager implements RouteService{

	private RouteDao routeDao;

	@Autowired
	public RouteManager(RouteDao routeDao) {
		this.routeDao = routeDao;
	}

	@Override
	public Route add(Route route) {
		if (route.getPrice() <= 0){
			return null;
		}
		else {
			return routeDao.save(route);
		}

	}

	@Override
	public List<Route> getAll() {
		List<Route> routes = this.routeDao.findAll();

		if(routes.size() < 1){
			return null;
		}
		else {
			return routes;
		}
	}

	@Override
	public List<Route> getBylanding(String landing) {
		List<Route> routes = this.routeDao.getBylanding(landing);

		if(routes.size() < 1){
			return null;
		}
		else {
			return routes;
		}

	}

	@Override
	public List<Route> getByAirlineCompany_CompanyName(String companyName) {
		return this.routeDao.getByAirlineCompany_CompanyName(companyName);
	}


}
