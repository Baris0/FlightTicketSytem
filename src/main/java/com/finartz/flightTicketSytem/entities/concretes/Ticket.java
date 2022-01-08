package com.finartz.flightTicketSytem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TICKET")
public class Ticket {

    @Id
    @Column(name = "TICKETNUMBER")
    private String ticketNumber;

    @Column(name = "TICKETPRICE")
    private double ticketPrice;
    /*
    @OneToOne()
    @JoinTable(name = "ROUTE")
    private Route route;
    */
}
