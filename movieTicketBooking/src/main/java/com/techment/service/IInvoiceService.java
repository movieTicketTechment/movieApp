package com.techment.service;

import java.util.List;
import com.techment.dto.InvoiceDto;
import com.techment.entity.Invoice;

public interface IInvoiceService {
	
	List<InvoiceDto> viewAllInvoice();
    String addInvoice(InvoiceDto invoiceDto);
	InvoiceDto viewInvoiceById(int id);
	void deleteInvoiceById(int id);
	Invoice gets(int id);


}