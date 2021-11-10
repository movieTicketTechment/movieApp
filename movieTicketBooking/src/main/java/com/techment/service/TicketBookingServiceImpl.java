package com.techment.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.TicketBookingDto;
import com.techment.dto.UserDto;
import com.techment.entity.TicketBooking;
import com.techment.entity.User;
import com.techment.repository.ITicketBookingRepository;

@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	
	@Autowired
	ITicketBookingRepository ticketBookingRepo;
	
	@Override
	public List<TicketBookingDto> viewAllTicketBooking() {
		// TODO Auto-generated method stub
		List<TicketBooking> ticketBooking = ticketBookingRepo.findAll();
		
		List<TicketBookingDto> ticketBookingDto = new ArrayList<TicketBookingDto>();
		
		for(TicketBooking t : ticketBooking)
		{
			ticketBookingDto.add(new TicketBookingDto(t.getBookingId(),t.getBookingDate(),t.getTotalPrice(),t.getBookingRef(),t.getLockTime(),t.getUserIpAdd(),t.getBookingStatus(),t.getUpdatedBy(),t.getDeleteField(),t.getStatus(),t.getRemark(),t.getToken(),t.getPaymentId(),t.getShowId(),t.getSeatIds(),t.getSeatList(),t.getUser()));
		
		}

		return ticketBookingDto;	
	}

	@Override
	public String addTicketBooking(TicketBookingDto ticketBookingDto) {
		
		 LocalDateTime myDateObj = LocalDateTime.now();  
		    
		   
		   
		TicketBooking ticketBooking = new TicketBooking();
		if(ticketBookingDto.getBookingId()!=0)
		{
			ticketBooking.setBookingId(ticketBookingDto.getBookingId());
		}
			ticketBooking.setBookingDate(myDateObj);
			ticketBooking.setTotalPrice(ticketBookingDto.getTotalPrice());
			ticketBooking.setBookingRef(ticketBookingDto.getBookingRef());
			ticketBooking.setLockTime(ticketBookingDto.getLockTime());
			ticketBooking.setUserIpAdd(ticketBookingDto.getUserIpAdd());
			ticketBooking.setBookingStatus(ticketBookingDto.getBookingStatus());
			ticketBooking.setUpdatedBy(ticketBookingDto.getUpdatedBy());
			
			ticketBooking.setDeleteField(ticketBookingDto.getDeleteField());
			ticketBooking.setPaymentId(ticketBookingDto.getPaymentId());
			ticketBooking.setStatus(ticketBookingDto.getStatus());
	        ticketBooking.setRemark(ticketBookingDto.getRemark());
			ticketBooking.setSeatIds(ticketBookingDto.getSeatIds());
			ticketBooking.setSeatList(ticketBookingDto.getSeatList());
			ticketBooking.setStatus(ticketBookingDto.getStatus());
			ticketBooking.setShowId(ticketBookingDto.getShowId());
			ticketBooking.setUser(ticketBookingDto.getUser());
			ticketBooking.setToken(ticketBookingDto.getToken());
			ticketBookingRepo.save(ticketBooking);
	     	return "Ticket Booking Added";
		
		
	}
	
	
	@Override
	public void deleteById(int id) {
		
		ticketBookingRepo.deleteById(id);
       }

	@Override
	public TicketBookingDto viewTicketBookingByBookingRef(String bookingRef) {
		TicketBooking tBooking = ticketBookingRepo.findByBookingRef(bookingRef).get();
		TicketBookingDto tBookingDto = new TicketBookingDto(tBooking.getBookingId(), tBooking.getBookingDate(), tBooking.getTotalPrice(), tBooking.getBookingRef(), tBooking.getLockTime(), tBooking.getUserIpAdd(),  tBooking.getBookingStatus(), tBooking.getUpdatedBy(), tBooking.getDeleteField(), tBooking.getBookingStatus(), tBooking.getRemark(), tBooking.getToken(), tBooking.getPaymentId(), tBooking.getShowId(), tBooking.getSeatIds(), tBooking.getSeatList(), tBooking.getUser()); 
		return tBookingDto;
	}
	
	@Override
	public List<TicketBookingDto> viewAllDetailByShowId(int showId) {
		
		return ticketBookingRepo.getJoindata(showId);
	}

}
