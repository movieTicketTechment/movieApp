package com.techment.dto;


import java.time.LocalDateTime;
import java.util.List;

import com.techment.entity.Movie;
import com.techment.entity.Screen;
import com.techment.entity.Theatre;





public class ShowDto {
	
	
	private  int showId;
	private   String showStartTime;
	private  String showEndTime;
	private  String showName;	
	private  String updatedBy;
	private  LocalDateTime updatedOn;	
	private  Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;
	private  Movie movie;
	private  Theatre theatre;
	private  Screen screen;
	
	public ShowDto() {
		super();
	}
	
	
	public ShowDto(int showId, String showStartTime, String showEndTime, String showName,
			String updatedBy, LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token,
			Movie movie, Theatre theatre, Screen screen) {
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
