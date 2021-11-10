package com.techment.entity;

import java.time.LocalDateTime;
import java.util.Date;
//import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;



@Entity
@Table(name= "ticket")

//@SQLDelete(sql = "UPDATE ticket SET delete_Field = true WHERE ticket_Id=?")
//@Where(clause = "delete_Field=false")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int ticketId;
	private  int noOfSeats;
	
//	@OneToMany
//	@JoinColumn(name="seatId")
//	private  List<Seat> seatNumber;
	
	private  String bookingRef;
	private  boolean ticketStatus;
	
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
	
	public Ticket() {
		super();
	}

	public Ticket(int ticketId, int noOfSeats, String bookingRef, boolean ticketStatus,
			String updatedBy, LocalDateTime updatedOn, Boolean deleteField, String status, String remark, String token) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		//this.seatNumber = seatNumber;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats 
				+ ", bookingRef=" + bookingRef + ", ticketStatus=" + ticketStatus + ", updatedBy=" + updatedBy
				+ ", updatedOn=" + updatedOn + ", deleteField=" + deleteField + ", status=" + status + ", remark="
				+ remark + ", token=" + token + "]";
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

//	public List<Seat> getSeatNumber() {
//		return seatNumber;
//	}
//
//	public void setSeatNumber(List<Seat> seatNumber) {
//		this.seatNumber = seatNumber;
//	}

	public String getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
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
	

	
}
