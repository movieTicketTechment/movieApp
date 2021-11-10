package com.techment.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techment.entity.Seat;
import com.techment.entity.User;

public class TicketBookingDto {
	private int BookingId;
	private LocalDateTime bookingDate;
	private double totalPrice;
	private String bookingRef;//alternate primary key
	private int lockTime;
	private String userIpAdd;
	private String bookingStatus;
	private  String updatedBy;

	private  Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;
	private int paymentId;
	private int showId;
  	private String seatIds;
  	private List<Seat> seatList;
	private User user;


	public TicketBookingDto() {
		super();
	}


	public TicketBookingDto(int bookingId, LocalDateTime bookingDate, double totalPrice, String bookingRef,
			String bookingStatus, String updatedBy, Boolean deleteField, String status, String remark, String token,
			int paymentId, int showId, String seatIds) {
		super();
		BookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalPrice = totalPrice;
		this.bookingRef = bookingRef;
		this.bookingStatus = bookingStatus;
		this.updatedBy = updatedBy;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.paymentId = paymentId;
		this.showId = showId;
		this.seatIds = seatIds;

	}


	public TicketBookingDto(int bookingId, LocalDateTime bookingDate, double totalPrice, String bookingRef,
			int lockTime, String userIpAdd, String bookingStatus, String updatedBy,
			Boolean deleteField, String status, String remark, String token, int paymentId, int showId, String seatIds,
			List<Seat> seatList, User user) {
		super();
		BookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalPrice = totalPrice;
		this.bookingRef = bookingRef;
		this.lockTime = lockTime;
		this.userIpAdd = userIpAdd;
		this.bookingStatus = bookingStatus;
		this.updatedBy = updatedBy;
	
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.paymentId = paymentId;
		this.showId = showId;
		this.seatIds = seatIds;
		this.seatList = seatList;
		this.user = user;
	}


	public int getBookingId() {
		return BookingId;
	}


	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}


	public LocalDateTime getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public String getBookingRef() {
		return bookingRef;
	}


	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}


	public int getLockTime() {
		return lockTime;
	}


	public void setLockTime(int lockTime) {
		this.lockTime = lockTime;
	}


	public String getUserIpAdd() {
		return userIpAdd;
	}


	public void setUserIpAdd(String userIpAdd) {
		this.userIpAdd = userIpAdd;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
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


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public int getShowId() {
		return showId;
	}


	public void setShowId(int showId) {
		this.showId = showId;
	}


	public String getSeatIds() {
		return seatIds;
	}


	public void setSeatIds(String seatIds) {
		this.seatIds = seatIds;
	}


	public List<Seat> getSeatList() {
		return seatList;
	}


	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}



	
	
}