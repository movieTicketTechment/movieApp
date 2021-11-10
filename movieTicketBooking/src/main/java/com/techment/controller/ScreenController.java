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

import com.techment.dto.ScreenTheatreDto;
import com.techment.entity.Screen;
import com.techment.entity.User;
import com.techment.service.IScreenService;

@CrossOrigin
@RestController
@RequestMapping(value = "/screen")
public class ScreenController {

	@Autowired
	IScreenService iScreenService;
	
	@GetMapping(value = "/viewAllScreens")
	public List<Screen> viewAllScreens(){
		return iScreenService.viewAllScreen();
	}
	@GetMapping(value = "/viewMappedData/")
	public List<ScreenTheatreDto> viewMappedData(){
		return iScreenService.getMappedData();
	}
	
	@PostMapping(value ="/addNewScreen")
	public ResponseEntity<String> addNewScreen(@RequestBody Screen screen)
			{
		return new ResponseEntity<String>(iScreenService.addScreen(screen), HttpStatus.ACCEPTED);
			}
	@GetMapping(value = "/viewScreenById/{id}")
	public Screen getScreenById(@PathVariable int id)
	{	
			return iScreenService.viewScreenById(id);
		
	}
	
	
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Screen screen)
	{	
		iScreenService.gets(id);
		
		Screen screens = screen;
		screens.setScreenId(id);
	
		iScreenService.addScreen(screens);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteScreen/{id}")  
	private void delete(@PathVariable("id") int id)   
	{ 
	
	iScreenService.deleteScreenById(id);  
		
	}  
	
	@PutMapping(value="/updateDeleteField/{id}")
	public ResponseEntity<String> updateDeleteField(@PathVariable int id, @RequestBody Screen screen)
	{	
		iScreenService.gets(id);
		
		Screen screens = screen;
		screens.setScreenId(id);
		
	
		iScreenService.addScreen(screens);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	

}
