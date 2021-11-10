package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.InvoiceDto;
import com.techment.entity.Invoice;

import com.techment.repository.IInvoiceRepository;
@Service
public class InvoiceServiceImpl implements IInvoiceService {

	@Autowired
	IInvoiceRepository invoiceRepo;
	
	@Override
	public List<InvoiceDto> viewAllInvoice() {
		 List<Invoice> invoices = invoiceRepo.findAll();
			
			List<InvoiceDto> invoiceDto = new ArrayList<InvoiceDto>();
			
			for(Invoice i : invoices)
			{
				invoiceDto.add(new InvoiceDto(i.getPaymentId(),i.getTicketBooking(),i.getUser()));
			}
			
			
			return invoiceDto;
	}

	@Override
	public String addInvoice(InvoiceDto invoiceDto) {
		
		Invoice invoice = new Invoice();		
		if(invoiceDto.getPaymentId()!=0)
		{
			invoice.setPaymentId(invoiceDto.getPaymentId());
		}		
		invoice.setTicketBooking(invoiceDto.getTicketBooking());
		invoice.setPaymentId(invoiceDto.getPaymentId());
		invoice.setUser(invoiceDto.getUser());
		invoiceRepo.save(invoice);		
		
		return "invoice added";

		
	}

	@Override
	public InvoiceDto viewInvoiceById(int id) {
		Invoice i  = invoiceRepo.findById(id).get();
		InvoiceDto invoiceDto = new InvoiceDto(); 
		
		return invoiceDto;

			}

	@Override
	public void deleteInvoiceById(int id) {
		invoiceRepo.deleteById(id);		

	}

	@Override
	public Invoice gets(int id) {
		return invoiceRepo.findById(id).get();

	}

}