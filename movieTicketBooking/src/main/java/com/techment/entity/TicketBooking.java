package com.techment.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "booking")
//@SQLDelete(sql = "UPDATE booking SET delete_Field = true WHERE Booking_Id=?")
//@Where(clause = "delete_Field=false")
public class TicketBooking  {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BookingId;
	private LocalDateTime bookingDate;
	private double totalPrice;
	private String bookingRef;//alternate primary key
	private int lockTime;
	private String userIpAdd;
	private String bookingStatus;
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
	private int paymentId;
	private int showId;
	private String seatIds;//store comma seprated seatIds
	
	@ElementCollection
	@Column(name="seatValues") // in table tbl_myentities
	private List<Seat> seatList;
	
	@ManyToOne
	@JoinColumn(name="userId", referencedColumnName = "userId")
	private User user;


	public TicketBooking() {
		super();
	}
 

	public TicketBooking(int bookingId, LocalDateTime bookingDate, double totalPrice, String bookingRef, int lockTime,
			String userIpAdd, String bookingStatus, String updatedBy, LocalDateTime updatedOn, Boolean deleteField,
			String status, String remark, String token, int paymentId, int showId, String seatIds, List<Seat> seatList,
			User user) {
		super();
		BookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalPrice = totalPrice;
		this.bookingRef = bookingRef;
		this.lockTime = lockTime;
		this.userIpAdd = userIpAdd;
		this.bookingStatus = bookingStatus;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
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