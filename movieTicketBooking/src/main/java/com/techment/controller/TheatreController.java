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

import com.techment.dto.TheatreDto;

import com.techment.entity.Theatre;
import com.techment.service.ITheatreService;

@CrossOrigin
@RestController
@RequestMapping(value = "/theatre")
public class TheatreController {

	@Autowired
	ITheatreService iTheatreService;
	
	
	@GetMapping(value = "/viewAllTheatre")
	public List<TheatreDto> viewAllSeat(){
		
		return iTheatreService.viewAllTheatre();
	}
	
	@PostMapping(value ="/addNewTheatre")
	public ResponseEntity<String> addNewTheatre(@RequestBody TheatreDto theatreDto)
			{
		return new ResponseEntity<String>(iTheatreService.addTheatre(theatreDto), HttpStatus.ACCEPTED);
			}
	@GetMapping(value = "/viewTheatreById/{id}")
	public TheatreDto getUserById(@PathVariable int id)
	{	
			return iTheatreService.viewTheatreById(id);
		
	}
	
	@PutMapping(value="/updateInShow/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody TheatreDto theatreDto)
	{	
        iTheatreService.gets(id);
		TheatreDto theatres = theatreDto;
		
		theatres.setTheatreId(id);
		
	
		iTheatreService.addTheatre(theatres);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	
	
	@DeleteMapping("/deleteTheatre/{id}")  
	private void delete(@PathVariable("id") int id)   
	{ 
	
	iTheatreService.deleteTheatreById(id);  
		
	} 
	
	
	
}