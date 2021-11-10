package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.TicketDto;
import com.techment.entity.Ticket;
import com.techment.entity.User;
import com.techment.entity.Ticket;
import com.techment.service.ITicketService;

@CrossOrigin
@RestController
@RequestMapping(value = "/Tickets")
public class TicketController {
	
	@Autowired
	ITicketService iTicketService;
	
	
	
	@GetMapping(value = "/viewAllTicket")
	public List<TicketDto> viewAllSeat(){
		return iTicketService.viewAllTicket();
	}
	@PostMapping(value ="/addNewTicket")
	public ResponseEntity<String> addNewTicket(@RequestBody TicketDto Ticket)
			{
		return new ResponseEntity<String>(iTicketService.addTicket(Ticket), HttpStatus.ACCEPTED);
			}
	@GetMapping(value = "/viewTicketById/{id}")
	public TicketDto getUserById(@PathVariable int id)
	{	
			return iTicketService.viewTicketById(id);
		
	}
	
	@PutMapping(value="/updateTicket/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody TicketDto ticket)
	{	
        iTicketService.gets(id);
		
		TicketDto tickets = ticket;
		tickets.setTicketId(id);
	
		iTicketService.addTicket(tickets);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteTicket/{id}")  
	private void delete(@PathVariable("id") int id)   
	{ 
	
	iTicketService.deleteTicketById(id);  
		
	}  

}
