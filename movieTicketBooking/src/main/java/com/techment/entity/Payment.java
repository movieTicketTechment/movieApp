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
@Table(name= "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int paymentId;
	private String paymentStatus;
	private String transactionId;
	private String modeOfPayment;
	private String createdOn;
	private int userId;
	private String totalPrice;
	private String updatedBy;
	@Column(name = "creationDate")
	@CreationTimestamp
	private Date createRecord;
	@UpdateTimestamp
	private  LocalDateTime updatedOn;
	private String deleteField="n";
	private String status;
	private String remark;
	private String token;
//	@OneToOne
//	private TicketBooking ticketBooking;
	
	public Payment() {
		super();
	}
	
	

	public Payment(int paymentId, String paymentStatus, String transactionId, String modeOfPayment, String createdOn,
		int userId, String totalPrice, String updatedBy, LocalDateTime updatedOn, String deleteField, String status,
		String remark, String token) {
	super();
	this.paymentId = paymentId;
	this.paymentStatus = paymentStatus;
	this.transactionId = transactionId;
	this.modeOfPayment = modeOfPayment;
	this.createdOn = createdOn;
	this.userId = userId;
	this.totalPrice = totalPrice;
	this.updatedBy = updatedBy;
	this.updatedOn = updatedOn;
	this.deleteField = deleteField;
	this.status = status;
	this.remark = remark;
	this.token = token;
}



	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
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

	public String getDeleteField() {
		return deleteField;
	}

	public void setDeleteField(String deleteField) {
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



	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentStatus=" + paymentStatus + ", transactionId="
				+ transactionId + ", modeOfPayment=" + modeOfPayment + ", createdOn=" + createdOn + ", userId=" + userId
				+ ", totalPrice=" + totalPrice + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ ", deleteField=" + deleteField + ", status=" + status + ", remark=" + remark + ", token=" + token
				+ "]";
	}
	
	

	

}
