package com.finartz.flightTicketSytem.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finartz.flightTicketSytem.business.abstracts.RouteService;
import com.finartz.flightTicketSytem.entities.concretes.Route;

@RestController
@RequestMapping("/api/routes/")
public class RouteController {
	
	private RouteService routeService;
	
	public RouteController(RouteService routeService) {
		this.routeService = routeService;
	}
	
	@GetMapping("getall")
	public List<Route> getAll(){
		return this.routeService.getAll();
	}
	
	@PostMapping("add")
	public Route add(@RequestBody Route route) {
		return this.routeService.add(route);
	}
	
	@GetMapping("getlanding")
	public List<Route> getBylanding(@RequestParam String landing){
		return this.routeService.getBylanding(landing);
	}
	
	
}
