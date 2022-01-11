package com.finartz.flightTicketSytem.business.concretes;

import com.finartz.flightTicketSytem.business.abstracts.TicketService;
import com.finartz.flightTicketSytem.dataAccess.abstracts.TicketDao;
import com.finartz.flightTicketSytem.entities.concretes.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketManager implements TicketService {

    private TicketDao ticketDao;

    @Autowired
    public TicketManager(TicketDao ticketDao){
        this.ticketDao = ticketDao;
    }

    @Override
    public Ticket add(Ticket ticket) {
        return this.ticketDao.save(ticket);
    }

    @Override
    public List<Ticket> getAll() {
        return this.ticketDao.findAll();
    }

    @Override
    public Ticket getByticketNumber(String ticketNumber) {
        return this.ticketDao.getByticketNumber(ticketNumber);
    }

}
