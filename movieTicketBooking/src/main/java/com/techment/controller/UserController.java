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

import com.techment.dto.UserDto;
import com.techment.dto.UserDtoShow;
import com.techment.entity.User;
import com.techment.exception.AlreadyExist;
import com.techment.exception.NotFound;
import com.techment.repository.IUserRepository;
import com.techment.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping(value = "/mainPanel")
public class UserController {
	
	@Autowired
	IUserService iUserService;
	
	@Autowired
	IUserRepository userRepo;
	
	
//	===========view all===========
	@GetMapping(value = "/viewAllUser")
	public List<UserDto> viewAllUser(){ 
		return iUserService.viewAllUser();
	}
	
	
// ===============add user ================
	@PostMapping(value ="/addNewUser")
	public ResponseEntity<String> addNewUser(@RequestBody UserDto userDto)
			{
				try {
			

					User Exist = userRepo.findByUserName(userDto.getUserName());
					
					if(Exist!=null)
						throw new AlreadyExist("User is already exist");
					
					else {

							String output =  iUserService.addUser(userDto, "user");
							return new ResponseEntity<String>(output,HttpStatus.CREATED);
						}
			
			
					}catch(Exception e) {
			
//						throw new AlreadyExist("User is already exist");
						throw new AlreadyExist("User is already exist");
					}
		
			}
	
	
	@PostMapping(value ="/addNewAdmin")
	public ResponseEntity<String> addNewAdmin(@RequestBody UserDto userDto)
			{
				try {
			

					User Exist = userRepo.findByUserName(userDto.getUserName());
					
					if(Exist!=null)
						throw new AlreadyExist("Admin is already exist");
					
					else {

							String output =  iUserService.addUser(userDto, "admin");
							return new ResponseEntity<String>(output,HttpStatus.CREATED);
						}
			
			
					}catch(Exception e) {
			
						throw new AlreadyExist("Admin is already exist");
					}
		
			}
	
	@PostMapping(value ="/addNewSAdmin")
	public ResponseEntity<String> addNewSAdmin(@RequestBody UserDto userDto)
			{
				try {
			

					User Exist = userRepo.findByUserName(userDto.getUserName());
					
					if(Exist!=null)
						throw new AlreadyExist("Sub Admin is already exist");
					
					else {

							String output =  iUserService.addUser(userDto, "subAdmin");
							return new ResponseEntity<String>(output,HttpStatus.CREATED);
						}
			
			
					}catch(Exception e) {
			
						throw new AlreadyExist("Sub Admin is already exist");
					}
		
			}
	
//	===========view by id===========
	@GetMapping(value = "/viewByIdUser/{id}")
	public UserDto getUserById(@PathVariable int id)
	{	
		try {
			
			UserDto users = iUserService.viewUserById(id);
			return users;
		}catch(Exception e)
		{
			throw new NotFound("user not found");
		}
			
		
	}
	
	
//	============ login ======
	@GetMapping(value = "/login/{userName}/{userPassword}")
	public ResponseEntity<UserDto> login(@PathVariable String userName, @PathVariable String userPassword)
	{
		UserDto users = iUserService.logined(userName, userPassword);
		users.setUserPassword("*******");
		
		if(users!=null) {
			
			return new ResponseEntity<UserDto>(users, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<UserDto>(users, HttpStatus.NO_CONTENT);
		}
	}
	
//	==========delete===========
	@DeleteMapping("/deleteUser/{id}")  
	private void delete(@PathVariable("id") int id)   
	{ 
	
	iUserService.deleteById(id);  
		
	}
	
//	==========update======
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody UserDto userDto)
	{	
		UserDto userOld = iUserService.viewUserById(id);
		
		UserDto users = userDto;
	
		users.setUserId(id);
		
	
		iUserService.addUser(users, userOld.getRole());
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	
	@GetMapping("/validateUser/{username}")
	public ResponseEntity<UserDtoShow> validate(@PathVariable String username){
		
		try {
			return new ResponseEntity<UserDtoShow>(iUserService.validateUser(username),HttpStatus.OK);
		}catch(Exception e) {
			throw new NotFound("user not found");
		}
		
		
	}
	// ==========view by user role=============	
		@GetMapping(value = "/viewAllUserByRole/{role}")
		public List<UserDto> viewAllUserByRole(@PathVariable String role){
			return iUserService.viewAllUserByRole(role);
		}
		


}
