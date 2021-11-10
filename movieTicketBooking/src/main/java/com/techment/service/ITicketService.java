package com.techment.service;

import java.util.List;

import com.techment.dto.TicketDto;
import com.techment.entity.Ticket;
import com.techment.entity.User;


public interface ITicketService {

	List<TicketDto> viewAllTicket();

	String addTicket(TicketDto ticketDto);

	TicketDto viewTicketById(int id);

	void deleteTicketById(int id);

	Ticket gets(int id);

	
}
