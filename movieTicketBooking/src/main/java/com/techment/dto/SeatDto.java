package com.techment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.techment.entity.Screen;

public class SeatDto {

	private int seatId;
	private String seatNumber;
	private String type;
	private double price;
	private  String releaseDate;
	private  String updatedBy;
	
	private  Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;
	private Screen screen;
	
	
	public SeatDto() {
		super();
	}

	public SeatDto(int seatId, String seatNumber, String type, double price, String releaseDate, String updatedBy, Boolean deleteField, String status, String remark, String token, Screen screen) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
		this.releaseDate = releaseDate;
		this.updatedBy = updatedBy;
	
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.screen = screen;
	}

	
	

	@Override
	public String toString() {
		return "SeatDto [seatId=" + seatId + ", seatNumber=" + seatNumber + ", type=" + type + ", price=" + price
				+ ", releaseDate=" + releaseDate + ", updatedBy=" + updatedBy 
				+ ", deleteField=" + deleteField + ", status=" + status + ", remark=" + remark + ", token=" + token
				+ ", screen=" + screen + "]";
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	
	
}
