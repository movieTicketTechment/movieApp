package com.techment.service;
import java.util.List;

import com.techment.dto.SeatDto;
import com.techment.entity.Seat;
public interface ISeatService {


		List<SeatDto> viewAllSeat();
		
	    String addSeat(SeatDto seatDto);
		
		SeatDto viewSeatById(int id);
		
		String deleteSeatById(int id);

		Seat gets(int id);

}
