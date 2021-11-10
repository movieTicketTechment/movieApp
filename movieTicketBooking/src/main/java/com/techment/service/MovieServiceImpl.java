package com.techment.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.MovieBannerDto;
import com.techment.dto.MovieDto;
import com.techment.entity.ImageModel;
import com.techment.entity.Movie;

import com.techment.repository.IMovieRepository;

@Service
public class MovieServiceImpl implements IMovieService{

	@Autowired
	IMovieRepository movieRepo;
	
	
	
	

	@Override
	public List<MovieDto> viewAllMovie() {
	
		
		List<Movie> movies = movieRepo.findAll();
		
		List<MovieDto> movieDto = new ArrayList<MovieDto>();
		
		for(Movie m : movies)
		{
			movieDto.add(new MovieDto(m.getMovieId(),m.getMovieName(), m.getMovieGenre(), m.getMovieHours(),m.getMovieDescription(),
					m.getReleaseDate() ,m.getUpdatedBy(), m.getUpdatedOn(), m.getDeleteField(), m.getStatus(),m.getRemark(),m.getToken(),m.getImageBanner()));
		}
		
		
		return movieDto;
	}



	@Override
	public String addMovie(MovieDto movieDto) {	
		
		Movie movie = new Movie();		
		if(movieDto.getMovieId()!=0)
		{
			movie.setMovieId(movieDto.getMovieId());
		}		
		movie.setMovieName(movieDto.getMovieName());
		movie.setMovieGenre(movieDto.getMovieGenre());	
		movie.setMovieHours(movieDto.getMovieHours());
		movie.setMovieDescription(movieDto.getMovieDescription());
		movie.setReleaseDate(movieDto.getReleaseDate());
		movie.setUpdatedBy(movieDto.getUpdatedBy());
		movie.setUpdatedOn(movie.getUpdatedOn());
		movie.setDeleteField(movieDto.getDeleteField());
		movie.setStatus(movieDto.getStatus());
		movie.setRemark(movieDto.getRemark());
		movie.setToken(movieDto.getToken());
		movie.setImageBanner(movieDto.getImageBanner());
		movieRepo.save(movie);		
		
		return "movie added";
	}



	@Override
	public MovieDto viewMovieById(int id) {
		Movie m  = movieRepo.findById(id).get();
		
		MovieDto movieDto = new MovieDto(m.getMovieId(),m.getMovieName(), m.getMovieGenre(), m.getMovieHours(),m.getMovieDescription(),m.getReleaseDate() ,m.getUpdatedBy(), m.getUpdatedOn(), m.getDeleteField(), m.getStatus(),m.getRemark(),m.getToken(),m.getImageBanner()); 
		
		return movieDto;
	}



	@Override
	public void deleteMovieById(int id) {
		movieRepo.deleteById(id);		
	}



	@Override
	public Movie gets(int id) {
		return movieRepo.findById(id).get();
	}



	@Override
	public List<MovieBannerDto> getMovieWithBanner() {
		return movieRepo.getMovieWithBanner();
	}

}
