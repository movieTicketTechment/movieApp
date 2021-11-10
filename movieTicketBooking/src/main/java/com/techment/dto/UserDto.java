package com.techment.dto;

public class UserDto {

	
	
	private int userId;
	private String userName;
	private String userPassword;
	private String userAddress;
	private String userEmail;
	private String userMobile;
	private String role;
//	private String updatedBy;
//	private String updatedOn;
//	private String resetPassword;
//	private String loginValidUpto;
//	private String loginfailCount;
//	private String loginSuspendUpto;
//	private String loginOtp;
//	private String deletedFile;
//	private String status;
//	private String remark;
	private String token;
	
	
//	----------constructors----------
	
	public UserDto() {
		super();
	}
	
	
	
	
	
public UserDto(int userId, String userName, String userPassword, String userAddress, String userEmail,
		String userMobile, String role, String token) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userAddress = userAddress;
	this.userEmail = userEmail;
	this.userMobile = userMobile;
	this.role = role;
	this.token = token;
}





//	-----------------  getter and setter -------


public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getUserAddress() {
	return userAddress;
}

public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}

public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

public String getUserMobile() {
	return userMobile;
}

public void setUserMobile(String userMobile) {
	this.userMobile = userMobile;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}


//	--------- to string -------
	


	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userAddress=" + userAddress + ", userEmail=" + userEmail + ", userMobile=" + userMobile + ", role="
				+ role + ", token=" + token + "]";
	}




	
	
	
}
