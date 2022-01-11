package com.finartz.flightTicketSytem.business.abstracts;

import com.finartz.flightTicketSytem.entities.concretes.Ticket;


import java.util.List;

public interface TicketService {
    Ticket add(Ticket ticket);
    List<Ticket> getAll();
    Ticket getByticketNumber(String ticketNumber);
}
