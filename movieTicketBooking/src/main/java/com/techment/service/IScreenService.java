package com.techment.service;

import java.util.List;

import com.techment.dto.ScreenTheatreDto;
import com.techment.entity.Screen;


public interface IScreenService {

	
	List<Screen> viewAllScreen();
    String addScreen(Screen screen);
	
	Screen viewScreenById(int id);
	
	void deleteScreenById(int id);
	Screen gets(int id);
	List<ScreenTheatreDto> getMappedData();
}
