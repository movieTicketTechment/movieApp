package com.techment.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;


@Entity
//@SQLDelete(sql = "UPDATE screen SET delete_Field = true WHERE screen_Id=?")
//@Where(clause = "delete_Field=false")
@Table(name= "screen")
public class Screen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int screenId;
	
	@NotNull (message="Screen Name is required")
	@NotBlank (message="Screen Name can not be empty")
	private  String screenName;
	
	@NotNull (message="Screen Name is required")
	@NotBlank (message="Screen Name can not be empty")
	private  int screenRows;
	
	@NotNull (message="Screen Name is required")
	@NotBlank (message="Screen Name can not be empty")
	private  int screenColumns;
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
	
    @ManyToOne  
    private Theatre theatre;  
	
	

	public Screen() {
		super();
	}



	public Screen(int screenId, String screenName, int screenRows, int screenColumns, String updatedBy,
			LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token, Theatre theatre) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.screenRows = screenRows;
		this.screenColumns = screenColumns;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.theatre = theatre;
	}



	public int getScreenId() {
		return screenId;
	}



	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}



	public String getScreenName() {
		return screenName;
	}



	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}



	public int getScreenRows() {
		return screenRows;
	}



	public void setScreenRows(int screenRows) {
		this.screenRows = screenRows;
	}



	public int getScreenColumns() {
		return screenColumns;
	}



	public void setScreenColumns(int screenColumns) {
		this.screenColumns = screenColumns;
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



	public Theatre getTheatre() {
		return theatre;
	}



	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	

}
