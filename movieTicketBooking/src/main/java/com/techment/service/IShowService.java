package com.techment.service;

import java.util.List;

import com.techment.dto.ShowDto;
import com.techment.dto.ShowMovieTheatreDto;



public interface IShowService {

	List<ShowDto> viewAllShow();
   String addShow(ShowDto showDto);
	
   /*ShowDto viewShowById(int id);
	Show gets(int id);*/
	void deleteShowById(int id);
	
	List<ShowMovieTheatreDto> viewAllShowMovieTheatreDetail(int sMovieId, String sTheatreCity,String sDate);
	List<ShowMovieTheatreDto> viewAllShowMovieTheatre();

	
}
 