package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.TheatreDto;
import com.techment.dto.UserDto;
import com.techment.entity.Theatre;
import com.techment.entity.User;
import com.techment.repository.ITheatreRepository;


@Service
public class TheatreServiceImpl implements ITheatreService {

	
	
	@Autowired
	ITheatreRepository theatreRepo;
	
	

	@Override
	public List<TheatreDto> viewAllTheatre() {
		// TODO Auto-generated method stub
		
	    List<Theatre> theatre =	theatreRepo.findAll();
			
			List<TheatreDto> theatreDto = new ArrayList<TheatreDto>();
			
			for(Theatre t : theatre)
			{
				theatreDto.add(new TheatreDto(t.getTheatreId(),t.getTheatreName(),t.getTheatreCity(),t.getManagerName(),t.getManagerContact(),t.getUpdatedBy(),t.getUpdatedOn(),t.getDeleteField(),t.getStatus(),t.getRemark(),t.getToken(),t.getUser()));
			}
			
			
			return theatreDto;
	}



	@Override
	public String addTheatre(TheatreDto theatreDto) {
		Theatre theatre = new Theatre();
		

		 if(theatreDto.getTheatreName()==null||theatreDto.getTheatreName()=="")
		{
			return "Please Give The Proper Name";
		}
		
		else if(theatreDto.getManagerName()==null||theatreDto.getManagerName()=="")
		{
			return "Please Give The Proper Name";
		}
		
		else if(theatreDto.getTheatreCity()==null||theatreDto.getTheatreCity()=="")
		{
			return "Please Give The Proper City";
		}
		else if(theatreDto.getManagerContact()==null||theatreDto.getManagerContact()=="")
		{
			return "Please Give The Proper Contact number";
		}
		else {
			if(theatreDto.getTheatreId()!=0)
			{
				theatre.setTheatreId(theatreDto.getTheatreId());
			}
		
		theatre.setTheatreName(theatreDto.getTheatreName());
		theatre.setTheatreCity(theatreDto.getTheatreCity());
		theatre.setTheatreCity(theatreDto.getTheatreCity());
		theatre.setManagerName(theatreDto.getManagerName());
		theatre.setManagerContact(theatreDto.getManagerContact());
	
		theatreRepo.save(theatre);
		return "Theatre Added";
	}

	}

	@Override
	public TheatreDto viewTheatreById(int id) {
		
		Theatre theatre = theatreRepo.findById(id).get();
		TheatreDto theatreDto = new TheatreDto(theatre.getTheatreId(),theatre.getTheatreName(),theatre.getTheatreCity(),theatre.getManagerName(),theatre.getManagerContact(),theatre.getUpdatedBy(),theatre.getUpdatedOn(),theatre.getDeleteField(),theatre.getStatus(),theatre.getRemark(),theatre.getToken(),theatre.getUser());

		return theatreDto;
	}



	@Override
	public void deleteTheatreById(int id) {
		theatreRepo.deleteById(id);
		
	}



	@Override
	public Theatre gets(int id) {
		return theatreRepo.findById(id).get();
	}



	



	

	


}
