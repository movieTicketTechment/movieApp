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

import com.techment.dto.MovieBannerDto;
import com.techment.dto.MovieDto;
import com.techment.entity.Movie;
import com.techment.entity.User;
import com.techment.service.IMovieService;

@CrossOrigin
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	IMovieService iMovieService;
	
	@GetMapping(value = "/viewAllMovies")
	public List<MovieDto> viewAllMovies(){
		return iMovieService.viewAllMovie();
	}
	@GetMapping(value = "/viewAllMoviesWithBanner")
	public List<MovieBannerDto> viewAllMovieWithBanner(){
		return iMovieService.getMovieWithBanner();
	}
	
	@PostMapping(value ="/addNewMovie")
	public ResponseEntity<String> addNewUser(@RequestBody MovieDto movieDto)
			{
		return new ResponseEntity<String>(iMovieService.addMovie(movieDto), HttpStatus.ACCEPTED);
			}
	
	@GetMapping(value = "/viewMovieById/{id}")
	public MovieDto getUserById(@PathVariable int id)
	{	
			return iMovieService.viewMovieById(id);
		
	}
	
	
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody MovieDto movieDto)
	{	
		iMovieService.gets(id);
		
		MovieDto movies = movieDto;
		movies.setMovieId(id);
	
		iMovieService.addMovie(movies);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteMovie/{id}")  
	private String delete(@PathVariable("id") int id)   
	{ 
	
	iMovieService.deleteMovieById(id);  
	
	return "Deleted successfully";
		
	}  
}
