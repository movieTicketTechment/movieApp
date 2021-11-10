package com.techment.service;

import java.util.List;

import com.techment.dto.TicketBookingDto;
import com.techment.entity.TicketBooking;

public interface ITicketBookingService {

	List<TicketBookingDto> viewAllTicketBooking();
	
	String addTicketBooking(TicketBookingDto tickBookingDto);
	void deleteById(int id);

	TicketBookingDto viewTicketBookingByBookingRef(String bookingRef);
	
	List<TicketBookingDto>viewAllDetailByShowId(int showId);
}
