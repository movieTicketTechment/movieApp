package com.techment.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techment.dto.MovieBannerDto;
import com.techment.dto.MovieDto;
import com.techment.entity.Movie;

public interface IMovieService {

	List<MovieDto> viewAllMovie();
    String addMovie(MovieDto movieDto);
	
	MovieDto viewMovieById(int id);
	
	void deleteMovieById(int id);

	Movie gets(int id);
	List<MovieBannerDto> getMovieWithBanner();
}
