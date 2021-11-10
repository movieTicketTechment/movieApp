package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.InvoiceDto;
import com.techment.service.IInvoiceService;

@CrossOrigin
@RestController
@RequestMapping(value = "/invoice")
public class InvoiceController {
	
	@Autowired
	IInvoiceService iInvoiceService;
	
	@GetMapping(value = "/viewAllInvoices")
	public List<InvoiceDto> viewAllInvoices(){
		return iInvoiceService.viewAllInvoice();
	}
	
	@PostMapping(value ="/addNewInvoice")
	public ResponseEntity<String> addNewUser(@RequestBody InvoiceDto invoiceDto)
			{
		return new ResponseEntity<String>(iInvoiceService.addInvoice(invoiceDto), HttpStatus.ACCEPTED);
			}
	
	@GetMapping(value = "/viewInvoiceById/{id}")
	public InvoiceDto getUserById(@PathVariable int id)
	{	
			return iInvoiceService.viewInvoiceById(id);
		
	}
	
	
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody InvoiceDto invoiceDto)
	{	
		iInvoiceService.gets(id);
		
		InvoiceDto invoices = invoiceDto;
		invoices.setPaymentId(id);
	
		iInvoiceService.addInvoice(invoices);
		
		return new ResponseEntity<String>("invoice updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteInvoice/{id}")  
	private String delete(@PathVariable("id") int id)   
	{ 
	
	iInvoiceService.deleteInvoiceById(id);  
	
	return "Deleted successfully";
		
	}  

}