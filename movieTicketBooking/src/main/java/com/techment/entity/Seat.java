package com.techment.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

@Entity
@Table(name= "seat")
//@SQLDelete(sql = "UPDATE seat SET delete_Field = true WHERE seat_Id=?")
//@Where(clause = "delete_Field=false")
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	private String seatNumber;
	private String type;
	private double price;
	private  String releaseDate;
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
	@JoinColumn(name="screenId", referencedColumnName = "screenId")
	private Screen screen;
	
	public Seat() {
		super();
	}

	public Seat(int seatId, String seatNumber, String type, double price, String releaseDate, String updatedBy,
			LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token, Screen screen) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
		this.releaseDate = releaseDate;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.screen = screen;
	}


	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", type=" + type + ", price=" + price
				+ ", releaseDate=" + releaseDate + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
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





	public Screen getScreen() {
		return screen;
	}





	public void setScreen(Screen screen) {
		this.screen = screen;
	}





	}