package com.techment.service;

import java.util.List;

import com.techment.dto.UserDto;
import com.techment.dto.UserDtoShow;
import com.techment.entity.User;


public interface IUserService{
	
	

	List<UserDto> viewAllUser();

	String addUser(UserDto userDto, String role);
	List<UserDto> viewAllUserByRole(String role);
	
	UserDto viewUserById(int id);
	
	void deleteById(int id);
	
	User gets(int id);
	
	UserDto logined(String userName, String userPassword);

	UserDtoShow validateUser(String username);

}
