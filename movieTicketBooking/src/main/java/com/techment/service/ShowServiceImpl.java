package com.techment.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.ShowDto;
import com.techment.dto.ShowMovieTheatreDto;
//import com.techment.dto.UserDto;
import com.techment.entity.Show;
//import com.techment.entity.User;
import com.techment.repository.IShowRepository;
@Service
public class ShowServiceImpl implements IShowService{

	@Autowired
	IShowRepository showRepo;
	
	

	@Override
	public List<ShowDto> viewAllShow() {
		// TODO Auto-generated method stub
		
		 List<Show> shows =	showRepo.findAll();
			
			List<ShowDto> showDto = new ArrayList<ShowDto>();
			
			for(Show s : shows)
			{
				showDto.add(new ShowDto(s.getShowId(),s.getShowStartTime(), s.getShowEndTime(), s.getShowName(),s.getUpdatedBy(),s.getUpdatedOn(),s.getDeleteField(),s.getStatus(),s.getRemark(),s.getToken(),s.getMovie(),s.getTheatre(),s.getScreen()));
			}
		
			
		return showDto;
	}



	@Override
	public String addShow(ShowDto showDto) {
		
		Show show = new Show();
		 if(showDto.getShowStartTime()==null|| showDto.getShowStartTime()=="")
		{
			return "Please Give The Proper show start time";
		}
		
		else if(showDto.getShowEndTime()==null||showDto.getShowEndTime()=="")
		{
			return "Please Give The Proper show end time";
		}
		 
		else if(showDto.getShowName()==null||showDto.getShowName()=="")
		{
			return "Please Give The Proper show Name";
		}
		 
		
		else {
		if(showDto.getShowId()!=0)
		{
			show.setShowId(showDto.getShowId());
		}
		
		show.setShowStartTime(showDto.getShowStartTime());
		show.setShowEndTime(showDto.getShowEndTime());
		show.setShowName(showDto.getShowName());
		show.setUpdatedBy(showDto.getUpdatedBy());
		show.setUpdatedOn(showDto.getUpdatedOn());
		show.setDeleteField(showDto.getDeleteField());
		show.setStatus(showDto.getStatus());
		show.setRemark(showDto.getRemark());
		show.setToken(showDto.getToken());
		show.setMovie(showDto.getMovie());
		show.setTheatre(showDto.getTheatre());
		show.setScreen(showDto.getScreen());
		
		
		showRepo.save(show);
		return "show added";
		}
	}
	@Override
	public void deleteShowById(int id) {
		showRepo.deleteById(id);
		
	}



	@Override
	public List<ShowMovieTheatreDto> viewAllShowMovieTheatre() {
		return showRepo.getJoindata();
		
	}
	
	@Override
	public List<ShowMovieTheatreDto> viewAllShowMovieTheatreDetail(int sMovieId,  String sTheatreCity,String sDate) {
		return showRepo.getShowdata(sMovieId, sTheatreCity,sDate);
		
	}

	}



	/*

	@Override
	public ShowDto viewShowById(int id) {
		
		Show s = showRepo.findById(id).get();
		
		ShowDto showDto = new ShowDto(s.getShowId(),s.getShowStartTime(), s.getShowEndTime(), s.getShowName(),s.getScreenId(),s.getTheatreId(),s.getUpdatedBy(), s.getUpdatedOn(),s.getDeleteField(),s.getStatus(), s.getRemark(),s.getToken());
		return showDto;
		
	}



	


	@Override
	public Show gets(int id) {
		return showRepo.findById(id).get();
	}
*/

