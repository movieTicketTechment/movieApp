package com.techment.dto;

import com.techment.entity.TicketBooking;
import com.techment.entity.User;

public class InvoiceDto {

	private  int paymentId;
	private TicketBooking ticketBooking;
	private User user;
	@Override
	public String toString() {
		return "InvoiceDto [paymentId=" + paymentId + ", ticketBooking=" + ticketBooking + ", user=" + user + "]";
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
	public InvoiceDto(int paymentId, TicketBooking ticketBooking, User user) {
		super();
		this.paymentId = paymentId;
		this.ticketBooking = ticketBooking;
		this.user = user;
	}
	public InvoiceDto() {
		super();
	}
	
	
}
