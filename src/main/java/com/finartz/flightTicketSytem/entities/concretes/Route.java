package com.finartz.flightTicketSytem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ROUTE")
public class Route {
	
	@Column(name="DEPARTURE")
	private String departure;
	
	@Id
	@Column(name="LANDING")
	private String landing;
	
	@Column(name="DEPARTURE_TIME")
	private String departureTime;
	
	@Column(name="LANDING_TIME")
	private String landingTime;

}
