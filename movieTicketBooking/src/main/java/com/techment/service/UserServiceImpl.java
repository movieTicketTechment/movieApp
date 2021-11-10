package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.UserDto;
import com.techment.dto.UserDtoShow;
import com.techment.entity.User;
import com.techment.repository.IUserRepository;
import com.techment.util.SiteUtil;

@Service
public class UserServiceImpl implements IUserService{

	
	@Autowired
	IUserRepository userRepo;

	@Autowired
	SiteUtil siteutil;
	
	@Override
	public List<UserDto> viewAllUser() {
		
    List<User> users =	userRepo.findAll();
		
	List<UserDto> userDto = new ArrayList<UserDto>();
		
		for(User u : users)
		{
			userDto.add(new UserDto(u.getUserId(), u.getUserName(), u.getUserPassword(), u.getUserAddress(), u.getUserEmail(), u.getUserMobile(), u.getRole(), u.getToken()));
		}
		
		
		return userDto;
		
	}
	
	
	@Override
	public String addUser(UserDto userDto, String role) {
	
		User user = new User();
		
		 if(userDto.getUserName()==null||userDto.getUserName()=="")
		{
			return "Please Give The Proper Name";
		}
		
		else if(userDto.getUserPassword()==null||userDto.getUserPassword()=="")
		{
			return "Please Give The Proper Password";
		}
		
		else if(userDto.getUserAddress()==null||userDto.getUserAddress()=="")
		{
			return "Please Give The Proper Address";
		}
		
		else if(userDto.getUserEmail()==null||userDto.getUserEmail()=="")
		{
			return "Please Give The Proper Email";
		}
		
		else if(userDto.getUserMobile() ==null||userDto.getUserMobile() =="")
		{
			return "Please Give The Proper Mobile";
		}
		else {
			
			if(userDto.getUserId()!=0)
			{
				user.setUserId(userDto.getUserId());
			}
				
		user.setUserName(userDto.getUserName());
		user.setUserAddress(userDto.getUserAddress());
		user.setUserPassword(userDto.getUserPassword());
		user.setUserEmail(userDto.getUserEmail());
		user.setUserMobile(userDto.getUserMobile());
		user.setRole(role);
		userRepo.save(user);
		return "User Added";
		}
	}


	@Override
	public UserDto viewUserById(int id) {
		User user = userRepo.findById(id).get();
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(),user.getUserPassword(),user.getUserAddress(),user.getUserEmail(),user.getUserMobile(),user.getRole(),user.getToken());
		return userDto;
	}


	@Override
	public void deleteById(int id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User gets(int id) {
		
		return userRepo.findById(id).get();
	}


	@Override
	public UserDto logined(String userName, String userPassword) {

		
		User user = userRepo.findByUserNameAndUserPassword(userName, userPassword).get();
		
		UserDto userDto= new UserDto(user.getUserId(), user.getUserName(),user.getUserPassword(),user.getUserAddress(),user.getUserEmail(),user.getUserMobile(),user.getRole(),user.getToken()) ;
		return userDto;
		
	}
	
	@Override
	public UserDtoShow validateUser(String user) {       
		User tokenUpdateuser =  userRepo.findByUserName(user);
		if(tokenUpdateuser!= null)
		{
			String token = siteutil.generateToken();  	
			tokenUpdateuser.setToken(token);  	
			userRepo.save(tokenUpdateuser);
		}



		UserDtoShow dto = new UserDtoShow(tokenUpdateuser.getUserName(), tokenUpdateuser.getToken());
		return dto;
	}


	@Override
	public List<UserDto> viewAllUserByRole(String role) {
		
		  List<User> users =	userRepo.findAllByRole(role);
			
			List<UserDto> userDto = new ArrayList<UserDto>();
				
				for(User u : users)
				{
					userDto.add(new UserDto(u.getUserId(), u.getUserName(), u.getUserPassword(), u.getUserAddress(), u.getUserEmail(), u.getUserMobile(), u.getRole(), u.getToken()));
				}
		
		
				return userDto;
	}
	
}
