package com.techment.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

@Entity
@Table(name= "theatre")
//@SQLDelete(sql = "UPDATE theatre SET delete_Field = true WHERE theatre_Id=?")
//@Where(clause = "delete_Field=false")
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int theatreId;
	@NotNull (message="Theatre Name is required")
	@NotBlank (message="Theatre Name can not be empty")
	private  String theatreName;
	
	@NotNull (message="Theatre City is required")
	@NotBlank (message="Theatre City can not be empty")
	private  String theatreCity;

	@NotNull (message="Manager Name is required")
	@NotBlank (message="Manager Name can not be empty")
	private  String managerName;

	@NotNull (message="Manager Contact is required")
	@NotBlank (message="Manager Contact can not be empty")
	private  String managerContact;
	private  String updatedBy;
	@Column(name = "creationDate")
	@CreationTimestamp
	private Date createRecord;
	@UpdateTimestamp
	private  LocalDateTime updatedOn;
	private  Boolean deleteField=Boolean.FALSE;
	private  String status;
	private  String remark;
	private  String token;
	
	@OneToOne
	@JoinColumn(name="userId", referencedColumnName = "userId")
	private User user;
	
	public Theatre() {
		super();
	}

	public Theatre(int theatreId, String theatreName, String theatreCity
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
