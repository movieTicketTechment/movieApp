package com.techment.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name= "invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int paymentId;
	@OneToOne
	private TicketBooking ticketBooking;
	@OneToOne
	private User user;
	@Column(name = "creationDate")
	@CreationTimestamp
	private Date createRecord;
	@UpdateTimestamp
	private  LocalDateTime updatedOn;
	
	
	public Invoice() {
		super();
	}

	public Invoice(int paymentId, TicketBooking ticketBooking, User user) {
		super();
		this.paymentId = paymentId;
		this.ticketBooking = ticketBooking;
		this.user = user;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public TicketBooking getTicketBooking() {
		return ticketBooking;
	}

	public void setTicketBooking(TicketBooking ticketBooking) {
		this.ticketBooking = ticketBooking;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Invoice [paymentId=" + paymentId + ", ticketBooking=" + ticketBooking + ", user=" + user + "]";
	}

	
	
	
}
