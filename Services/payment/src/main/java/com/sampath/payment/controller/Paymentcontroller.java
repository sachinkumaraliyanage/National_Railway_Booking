package com.sampath.payment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampath.payment.domain.Payment;



@RestController
@RequestMapping(value = "/sampath")
@CrossOrigin(origins = "*")
public class Paymentcontroller {
	@RequestMapping(value = "/payment",method=RequestMethod.POST)
	public ResponseEntity<?> makepayment(@RequestBody Payment pay){
		pay.print();
		String a="ok";
		if("ok".equalsIgnoreCase(a)) {
			return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>(null, HttpStatus.FAILED_DEPENDENCY);
		
	}
}
