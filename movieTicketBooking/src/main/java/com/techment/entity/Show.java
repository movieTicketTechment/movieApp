package com.techment.entity;


import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;


@Entity
@Table(name= "showDetail")
//@SQLDelete(sql = "UPDATE show_detail SET delete_Field = true WHERE show_Id=?")
//@Where(clause = "delete_Field=false")
public class Show  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int showId;

	@NotNull (message="Show Start time is required")
	@NotBlank (message="Show Start time can not be empty")
	private   String showStartTime;
	
	@NotNull (message="Show end time is required")
	@NotBlank (message="Show end time can not be empty")
	private  String showEndTime;
	
	@NotNull (message="Show Name is required")
	@NotBlank (message="Show Name can not be empty")
	private  String showName;	
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
	@JoinColumn(name="movieId", referencedColumnName = "movieId")
	private  Movie movie;
	@ManyToOne
	@JoinColumn(name="theatreId", referencedColumnName = "theatreId")
	private  Theatre theatre;
	@ManyToOne
	@JoinColumn(name="screenId", referencedColumnName = "screenId")
	private  Screen screen;


	public Show() {
		super(); 
	}


	public Show(int showId, String showStartTime, String showEndTime, String showName, String updatedBy,
			LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token, Movie movie,
			Theatre theatre, Screen screen) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.movie = movie;
		this.theatre = theatre;
		this.screen = screen;
	}


	public int getShowId() {
		return showId;
	}


	public void setShowId(int showId) {
		this.showId = showId;
	}


	public String getShowStartTime() {
		return showStartTime;
	}


	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}


	public String getShowEndTime() {
		return showEndTime;
	}


	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}


	public String getShowName() {
		return showName;
	}


	public void setShowName(String showName) {
		this.showName = showName;
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


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public Theatre getTheatre() {
		return theatre;
	}


	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}


	public Screen getScreen() {
		return screen;
	}


	public void setScreen(Screen screen) {
		this.screen = screen;
	}


	
	
	}
