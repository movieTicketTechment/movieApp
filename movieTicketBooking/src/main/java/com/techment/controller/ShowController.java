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

import com.techment.dto.ShowDto;
import com.techment.dto.ShowMovieTheatreDto;
import com.techment.entity.Show;
import com.techment.entity.User;
import com.techment.service.IShowService;

@CrossOrigin
@RestController
@RequestMapping(value = "/show")
public class ShowController {

	@Autowired
	IShowService iShowService;
	
	@GetMapping(value = "/viewAllShow")
	public List<ShowDto> viewAllSeat(){
		return iShowService.viewAllShow();
	}
	@PostMapping(value ="/addNewShow")
	public ResponseEntity<String> addNewShow(@RequestBody ShowDto showDto)
			{
		return new ResponseEntity<String>(iShowService.addShow(showDto), HttpStatus.ACCEPTED);
			}
/*@GetMapping(value = "/viewShowById/{id}")
	public ShowDto getUserById(@PathVariable int id)
	{	
			return iShowService.viewShowById(id);
		
	}
	
	
	@PutMapping(value="/updateInShow/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody ShowDto showDto)
	{	
        iShowService.gets(id);
		
		ShowDto shows = showDto;
		shows.setShowId(id);
	
		iShowService.addShow(shows);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}*/
	
	@DeleteMapping("/deleteShow/{id}")  
	private void delete(@PathVariable("id") int id)   
	{ 
	
	iShowService.deleteShowById(id);  
		
	}  
	@GetMapping(value = "/viewAllShowMovieTheatre")
	public List<ShowMovieTheatreDto> viewAllShowList(){
		return iShowService.viewAllShowMovieTheatre();
	}
		
	
	
	
	
	@GetMapping(value = "/viewAllShowMovieTheatre/{id}/{theatreCity}/{showDate}")
	public List<ShowMovieTheatreDto> viewAllShowList(@PathVariable("id") int sMovieId ,@PathVariable("theatreCity") String sTheatreCity,@PathVariable("showDate") String sDate){
		return iShowService.viewAllShowMovieTheatreDetail(sMovieId,sTheatreCity,sDate);
	}
	
	
	
	
	
	
}
