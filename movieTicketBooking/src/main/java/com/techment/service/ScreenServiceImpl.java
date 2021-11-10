package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.ScreenTheatreDto;
import com.techment.entity.Screen;
import com.techment.repository.IScreenRepository;

@Service
public class ScreenServiceImpl implements IScreenService{

	@Autowired
	IScreenRepository screenRepo;
	
	
	@Override
	public List<Screen> viewAllScreen() {
		return screenRepo.findAll();
	}


	@Override
	public String addScreen(Screen screen) {
		 if(screen.getScreenName()==null|| screen.getScreenName()=="")
			{
				return "Please Give The Proper Screen Name";
			}
			
		 else {
		screenRepo.save(screen);
		return "screen added";
		 }
	}


	@Override
	public Screen viewScreenById(int id) {
		return screenRepo.findById(id).get();

	}


	@Override
	public void deleteScreenById(int id) {
		screenRepo.deleteById(id);

		
	}


	@Override
	public Screen gets(int id) {
		return screenRepo.findById(id).get();
	}


	@Override
	public List<ScreenTheatreDto> getMappedData() {
		
		return screenRepo.getJoindata();
	}


	

	

}
