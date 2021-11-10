package com.techment.dto;

import java.time.LocalDateTime;

import com.techment.entity.User;



 public class TheatreDto {

	private  int theatreId;
	private  String theatreName;
	private  String theatreCity;
	private  String managerName;
	private  String managerContact;
	private  String updatedBy;
	private  LocalDateTime updatedOn;
	private Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;
    private User user;

	public TheatreDto() {
		super();
	}

	public TheatreDto(int theatreId, String theatreName, String theatreCity
			, String managerName, String managerContact, String updatedBy,
			LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token,User user) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.user=user;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}


	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
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

	public Boolean getDeleteField() {
		return deleteField;
	}

	public void setDeleteField(Boolean deleteField) {
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
	
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", managerName=" + managerName + ", managerContact=" + managerContact + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + ", deleteField=" + deleteField + ", status=" + status + ", remark="
				+ remark + ", token=" + token + "]";
	}

	

}



