package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.TicketDto;
import com.techment.dto.UserDto;
import com.techment.entity.Ticket;
import com.techment.entity.User;
import com.techment.repository.ITicketRepository;

@Service
public class TicketServiceImpl implements ITicketService{

	@Autowired
	ITicketRepository ticketRepo;
	

	@Override
	public List<TicketDto> viewAllTicket() {
		 List<Ticket> tickets =	ticketRepo.findAll();
			
			List<TicketDto> ticketDto = new ArrayList<TicketDto>();
			
			for(Ticket u : tickets)
			{
				ticketDto.add(new TicketDto(u.getTicketId(), u.getNoOfSeats(),u.getBookingRef(),u.isTicketStatus(),u.getUpdatedBy(),u.getUpdatedOn(),u.getDeleteField(),u.getStatus(),u.getRemark(),u.getToken()));
			}
			
			
			return ticketDto;
	}


	@Override
	public String addTicket(TicketDto ticketDto) {
		Ticket ticket = new Ticket();
		if(ticketDto.getTicketId()!=0)
		{
			ticket.setTicketId(ticketDto.getTicketId());
		}
		ticket.setTicketId(ticketDto.getTicketId());
		ticket.setNoOfSeats(ticketDto.getNoOfSeats());
		ticket.setBookingRef(ticketDto.getBookingRef());
		ticket.setTicketStatus(ticketDto.isTicketStatus());
		ticket.setUpdatedBy(ticketDto.getUpdatedBy());
		ticket.setUpdatedOn(ticketDto.getUpdatedOn());
		ticket.setStatus(ticketDto.getStatus());
		ticket.setRemark(ticketDto.getRemark());
		ticket.setToken(ticketDto.getToken());
		ticketRepo.save(ticket);
		return "Ticket Passed";
	}


	@Override
	public TicketDto viewTicketById(int id) {

		Ticket ticket = ticketRepo.findById(id).get();
		TicketDto ticketDto = new TicketDto(ticket.getTicketId(), ticket.getNoOfSeats(),ticket.getBookingRef(),ticket.isTicketStatus(),ticket.getUpdatedBy(),ticket.getUpdatedOn(),ticket.getDeleteField(),ticket.getStatus(),ticket.getRemark(),ticket.getToken());
		return ticketDto;
	}


	@Override
	public void deleteTicketById(int id) {

		ticketRepo.deleteById(id);
		
	}


	@Override
	public Ticket gets(int id) {
		return ticketRepo.findById(id).get();
	}



}
