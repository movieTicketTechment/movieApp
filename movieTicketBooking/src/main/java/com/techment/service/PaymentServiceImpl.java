package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.MovieDto;
import com.techment.dto.PaymentDto;
import com.techment.dto.PaymentDto;
import com.techment.entity.Movie;
import com.techment.entity.Payment;
import com.techment.entity.Payment;
import com.techment.repository.IPaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {
	
	@Autowired
	IPaymentRepository paymentRepo;

	@Override
	public List<PaymentDto> viewAllPayment() {
     List<Payment> payments = paymentRepo.findAll();
		
		List<PaymentDto> paymentDto = new ArrayList<PaymentDto>();
		
		for(Payment p : payments)
		{
			paymentDto.add(new PaymentDto(p.getPaymentId(),p.getPaymentStatus(),p.getTransactionId(),p.getModeOfPayment(),p.getCreatedOn(),p.getUserId(),p.getTotalPrice(),p.getUpdatedBy(),p.getUpdatedOn(),p.getDeleteField(),p.getStatus(),p.getRemark(),p.getToken()));
		}
		
		
		return paymentDto;
	}

	@Override
	public String addPayment(PaymentDto paymentDto) {

		Payment payment = new Payment();		
		if(paymentDto.getPaymentId()!=0)
		{
			payment.setPaymentId(paymentDto.getPaymentId());
		}		
		payment.setPaymentStatus(paymentDto.getPaymentStatus());
		payment.setTransactionId(paymentDto.getTransactionId());
		payment.setModeOfPayment(paymentDto.getModeOfPayment());
		payment.setCreatedOn(paymentDto.getCreatedOn());
		payment.setTotalPrice(paymentDto.getTotalPrice());
		payment.setUpdatedBy(paymentDto.getUpdatedBy());
		payment.setUpdatedOn(paymentDto.getUpdatedOn());
		payment.setDeleteField(paymentDto.getDeleteField());
		payment.setStatus(paymentDto.getStatus());
		payment.setRemark(paymentDto.getRemark());
		payment.setToken(paymentDto.getToken());
//		payment.setTicketBooking(paymentDto.getTicketBooking());
		
		
		
		
		paymentRepo.save(payment);		
		
		return "payment added";

			}

	@Override
	public PaymentDto viewPaymentById(int id) {
		
        Payment p  = paymentRepo.findById(id).get();
		
		PaymentDto paymentDto = new PaymentDto(); 
		
		return paymentDto;
		
	}

	@Override
	public void deletePaymentById(int id) {
		paymentRepo.deleteById(id);		
		
	}

	@Override
	public Payment gets(int id) {
		return paymentRepo.findById(id).get();
	}

}
