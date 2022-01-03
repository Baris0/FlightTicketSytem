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
		return this.routeDao.save(route);
	}

	@Override
	public List<Route> getAll() {
		return this.routeDao.findAll();
	}

	@Override
	public List<Route> getBylanding(String landing) {
		return this.routeDao.getBylanding(landing);
	}
	
}
