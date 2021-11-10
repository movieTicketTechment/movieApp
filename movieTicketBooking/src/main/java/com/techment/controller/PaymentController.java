package com.techment.controller;

import java.util.List;
import java.util.Map;

//import org.json.JSONObject;
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
import com.techment.dto.PaymentDto;
import com.techment.service.IPaymentService;
//import com.razorpay.RazorpayClient;
//import com.razorpay.Order;


@CrossOrigin
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@Autowired
	IPaymentService iPaymentService;
	
	@GetMapping(value = "/viewAllPayments")
	public List<PaymentDto> viewAllPayments(){
		return iPaymentService.viewAllPayment();
	}
	
	@PostMapping(value ="/addNewPayment")
	public ResponseEntity<String> addNewUser(@RequestBody PaymentDto paymentDto) throws Exception
			{
			return new ResponseEntity<String>(iPaymentService.addPayment(paymentDto), HttpStatus.ACCEPTED);
			}
	
	@GetMapping(value = "/viewPaymentById/{id}")
	public PaymentDto getUserById(@PathVariable int id)
	{	
			return iPaymentService.viewPaymentById(id);
		
	}
	
	
	@PutMapping(value="/updateValues/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody PaymentDto paymentDto)
	{	
		iPaymentService.gets(id);
		
		PaymentDto payments = paymentDto;
		payments.setPaymentId(id);
	
		iPaymentService.addPayment(payments);
		
		return new ResponseEntity<String>("user updated..",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletePayment/{id}")  
	private String delete(@PathVariable("id") int id)   
	{ 
	
	iPaymentService.deletePaymentById(id);  
	
	return "Deleted successfully";
		
	}  
	
	
//	@PostMapping(value ="/crea tingOrder")
//	public String createOrder(@RequestBody PaymentDto paymentDto) throws Exception
//			{
//		RazorpayClient client = new RazorpayClient("rzp_test_VChXAJu441uESm","N0MWriEXCc02Pt7ek6CpibDt");
//		
//		JSONObject options = new JSONObject();
//		options.put("amount", 5);
//		options.put("currency", "INR");
//		options.put("receipt", "txn_123456");
//		Order order = client.Orders.create(options);
//		
//		System.out.println(order);
//		
//		return "done";
//		
//			
//			}
	
	
	

}
