package com.finartz.flightTicketSytem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finartz.flightTicketSytem.entities.concretes.Route;

public interface RouteDao extends JpaRepository<Route, String>{

	List<Route> getBylanding(String landing);

}
