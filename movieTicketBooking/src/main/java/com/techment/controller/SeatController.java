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

import com.techment.dto.SeatDto;
import com.techment.entity.Seat;
import com.techment.entity.User;
import com.techment.service.ISeatService;

@CrossOrigin
@RestController
@RequestMapping(value = "/seat")
public class SeatController {

	

	@Autowired
	ISeatService iSeatService;
	
	@GetMapping(value = "/viewAllSeat")
	public List<SeatDto> viewAllSeat(){
		return iSeatService.viewAllSeat();
	}
	@PostMapping(value ="/addNewSeat")
	public ResponseEntity<String> addNewSeat(@RequestBody SeatDto seatDto)
			{
		return new ResponseEntity<String>(iSeatService.addSeat(seatDto), HttpStatus.ACCEPTED);
			}
	
	@GetMapping(value = "/viewSeatById/{id}")
	public SeatDto getUserById(@PathVariable int id)
	{	
			return iSeatService.viewSeatById(id);
		
	}
	
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody SeatDto seatDto)
	{	
		iSeatService.gets(id);
		
		SeatDto seats = seatDto;
		seats.setSeatId(id);
	
		iSeatService.addSeat(seats);
		
		return new ResponseEntity<String>("Seat updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteSeat/{id}")  
	private ResponseEntity<String> delete(@PathVariable("id") int id)   
	{ 
	
		iSeatService.deleteSeatById(id);  
		return new ResponseEntity<String>("Seat deleated..",HttpStatus.OK);
		
		
	}  

	
}