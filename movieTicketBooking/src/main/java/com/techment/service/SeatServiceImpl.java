package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.SeatDto;
import com.techment.dto.UserDto;
import com.techment.entity.Screen;
import com.techment.entity.Seat;
import com.techment.entity.User;
import com.techment.repository.ISeatRepository;

@Service
public class SeatServiceImpl implements ISeatService{

	
	@Autowired
	ISeatRepository seatRepo;
	
	@Override
	public List<SeatDto> viewAllSeat() {
		List<Seat> seat = seatRepo.findAll();
		
		List<SeatDto> seatDto =  new ArrayList<SeatDto>();
		
		for(Seat s : seat) {
			seatDto.add(new SeatDto(s.getSeatId(),s.getSeatNumber(),s.getType(),
					s.getPrice(),s.getReleaseDate(),s.getUpdatedBy(),
					s.getDeleteField(),s.getStatus(),s.getRemark(),s.getToken(),s.getScreen()));			
		}
		return  seatDto;
	}

	@Override
	public String addSeat(SeatDto seatDto) {
	
		
		Seat seat = new Seat();
		if(seatDto.getSeatId()!=0)
		{
			seat.setSeatId(seatDto.getSeatId());
		}
		seat.setSeatNumber(seatDto.getSeatNumber());
		seat.setType(seatDto.getType());
		seat.setPrice(seatDto.getPrice());
		seat.setReleaseDate(seatDto.getReleaseDate());
		seat.setUpdatedBy(seatDto.getUpdatedBy());
		seat.setDeleteField(seatDto.getDeleteField());
		seat.setStatus(seatDto.getStatus());
		seat.setRemark(seatDto.getRemark());
		seat.setToken(seatDto.getToken());
		seat.setScreen(seatDto.getScreen());
	
			
		seatRepo.save(seat);
		return "seat added";
	}

	@Override
	public SeatDto viewSeatById(int id) {
		
		Seat seat = seatRepo.findById(id).get();
		SeatDto seatDto = new SeatDto(seat.getSeatId(),seat.getSeatNumber(),seat.getType(),seat.getPrice(),seat.getReleaseDate(),seat.getUpdatedBy(),seat.getDeleteField(),seat.getStatus(),seat.getRemark(),seat.getToken(),seat.getScreen());
		return seatDto;
	}

	@Override
	public String deleteSeatById(int id) {
		
		seatRepo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Seat gets(int id) {
		return seatRepo.findById(id).get();
	}

}