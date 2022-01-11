package com.finartz.flightTicketSytem.dataAccess.abstracts;

import com.finartz.flightTicketSytem.entities.concretes.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, String> {
    Ticket getByticketNumber(String ticketNumber);
}
