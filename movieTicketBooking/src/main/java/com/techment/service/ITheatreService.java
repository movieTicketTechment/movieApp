package com.techment.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.techment.entity.Theatre;
import com.techment.dto.TheatreDto;


public interface ITheatreService {


	List<TheatreDto> viewAllTheatre();
	
	
	 String addTheatre(TheatreDto theatreDto);
		
	 TheatreDto viewTheatreById(int id);
		
	void deleteTheatreById(int id);

	Theatre gets(int id);
	

}
