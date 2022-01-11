package com.finartz.flightTicketSytem.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="AIRLINE_COMPANY")
public class AirlineCompany {

	@Id
	@Column(name="COMPANY_NAME")
	private String companyName;


}
