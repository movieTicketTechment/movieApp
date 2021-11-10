package com.techment.service;

import java.util.List;

import com.techment.dto.PaymentDto;
import com.techment.entity.Payment;

public interface IPaymentService {

	List<PaymentDto> viewAllPayment();
    String addPayment(PaymentDto paymentDto);
	PaymentDto viewPaymentById(int id);
	void deletePaymentById(int id);
	Payment gets(int id);
}
