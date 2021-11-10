package com.techment.entity;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;


@Entity
@Table(name= "user")

//@SQLDelete(sql = "UPDATE user SET delete_Field = true WHERE user_Id=?")
//@Where(clause = "delete_Field=false")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	
	@NotNull (message="username is required")
	@NotBlank (message="username can not be empty")
	@Column(unique = true)
	private String userName;
	
	@NotNull (message="password is required")
	@NotBlank (message="password can not be empty")
	private String userPassword;
	
	@NotNull (message="Address is required")
	@NotBlank (message="Address can not be empty")
	private String userAddress;
	
	
	@NotNull (message="email is required")
	@NotBlank (message="email can not be empty")
	private String userEmail;
	
	@NotNull (message="mobile is required")
	@NotBlank (message="mobile can not be empty")
	private String userMobile;
	private String role;
	private String updatedBy;
	@Column(name = "creationDate")
	@CreationTimestamp
	private Date createRecord;
	@UpdateTimestamp
	private  LocalDateTime updatedOn;
	private String resetPassword;
	private String loginValidUpto;
	private String loginfailCount;
	private String loginSuspendUpto;
	private String loginOtp;
	private  Boolean deleteField=Boolean.FALSE;
	private String status;
	private String remark;
	private String token;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}
	public String getLoginValidUpto() {
		return loginValidUpto;
	}
	public void setLoginValidUpto(String loginValidUpto) {
		this.loginValidUpto = loginValidUpto;
	}
	public String getLoginfailCount() {
		return loginfailCount;
	}
	public void setLoginfailCount(String loginfailCount) {
		this.loginfailCount = loginfailCount;
	}
	public String getLoginSuspendUpto() {
		return loginSuspendUpto;
	}
	public void setLoginSuspendUpto(String loginSuspendUpto) {
		this.loginSuspendUpto = loginSuspendUpto;
	}
	public String getLoginOtp() {
		return loginOtp;
	}
	public void setLoginOtp(String loginOtp) {
		this.loginOtp = loginOtp;
	}
	public Boolean getDeleteField() {
		return deleteField;
	}
	public void setDeletedField( Boolean deleteField) {
		this.deleteField = deleteField;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public User(int userId, String userName, String userPassword, String userAddress, String userEmail,
			String userMobile, String role, String updatedBy, LocalDateTime updatedOn, String resetPassword,
			String loginValidUpto, String loginfailCount, String loginSuspendUpto, String loginOtp, Boolean deleteField,
			String status, String remark, String token) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.role = role;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.resetPassword = resetPassword;
		this.loginValidUpto = loginValidUpto;
		this.loginfailCount = loginfailCount;
		this.loginSuspendUpto = loginSuspendUpto;
		this.loginOtp = loginOtp;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + ", userEmail=" + userEmail + ", userMobile=" + userMobile + ", role=" + role
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", resetPassword=" + resetPassword
				+ ", loginValidUpto=" + loginValidUpto + ", loginfailCount=" + loginfailCount + ", loginSuspendUpto="
				+ loginSuspendUpto + ", loginOtp=" + loginOtp + ", deletedFile=" + deleteField + ", status=" + status
				+ ", remark=" + remark + ", token=" + token + "]";
	}
	
	
	

	



	

	
	
	
	
	
}
