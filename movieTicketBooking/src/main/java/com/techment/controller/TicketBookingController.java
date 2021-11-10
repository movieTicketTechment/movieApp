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

import com.techment.dto.TicketBookingDto;
import com.techment.dto.UserDto;
import com.techment.entity.TicketBooking;
import com.techment.entity.User;
import com.techment.exception.NotFound;
import com.techment.service.ITicketBookingService;

@CrossOrigin
@RestController
@RequestMapping(value = "/ticketBooking")
public class TicketBookingController {
	@Autowired
	ITicketBookingService iTicketBookingService;
	
	@GetMapping(value = "/viewAllTicketBooking")
	public List<TicketBookingDto> viewAllTicketBooing(){
		
		return iTicketBookingService.viewAllTicketBooking();
	}	
	
	@PostMapping(value ="/addNewTicketBooking")
	public ResponseEntity<String> addNewUser(@RequestBody TicketBookingDto ticketBookingDto)
			{
		return new ResponseEntity<String>(iTicketBookingService.addTicketBooking(ticketBookingDto), HttpStatus.ACCEPTED);
			}
	
	@DeleteMapping("/deleteUser/{id}")  
	private void delete(@PathVariable("id") int id)   
	{  
	
	iTicketBookingService.deleteById(id);  
		
	}
	
	

	@GetMapping(value = "/viewByBookingRef/{bookingRef}")
	public TicketBookingDto getTicketBookingByBookingRef(@PathVariable String bookingRef)
	{	
		try {
			
			 TicketBookingDto tBookDto = iTicketBookingService.viewTicketBookingByBookingRef(bookingRef);
			return tBookDto;
		}catch(Exception e)
		{
			throw new NotFound("not found");
		}
			
		
	}
	
	
	@GetMapping(value = "/viewAllTicketBookingByShowId/{bookingRef}")
	public List<TicketBookingDto> viewAllTicketBooingByShowId(@PathVariable("bookingRef") int bookingRef){
		
		return iTicketBookingService.viewAllDetailByShowId(bookingRef);
	}
	
	
	@PutMapping(value="/updateBooking/{bookingRef}")
	public ResponseEntity<String> update(@PathVariable String bookingRef)
	{	
		 TicketBookingDto tBookDto = iTicketBookingService.viewTicketBookingByBookingRef(bookingRef);
		
		 tBookDto.setBookingStatus("Confirmed");		
	
		iTicketBookingService.addTicketBooking(tBookDto);
		
		return new ResponseEntity<String>("ticketBooking updated..",HttpStatus.OK);
		
	}

	

}

	
	

