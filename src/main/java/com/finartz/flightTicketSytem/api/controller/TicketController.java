package com.finartz.flightTicketSytem.api.controller;

import com.finartz.flightTicketSytem.business.abstracts.TicketService;
import com.finartz.flightTicketSytem.entities.concretes.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tickets/")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    @PostMapping("add")
    public Ticket add(Ticket ticket){
        return this.ticketService.add(ticket);
    }

    @GetMapping("getall")
    public List<Ticket> getAll(){
        return this.ticketService.getAll();
    }

    @GetMapping("getbyticketnumber")
    public Ticket getByticketNumber(String ticketNumber){
        return this.ticketService.getByticketNumber(ticketNumber);
    }


}
