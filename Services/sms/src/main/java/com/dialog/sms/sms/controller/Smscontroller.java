package com.dialog.sms.sms.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dialog.sms.sms.domain.Sms;


@RestController
@RequestMapping(value = "/dialog")
@CrossOrigin(origins = "*")
public class Smscontroller {
	
	@RequestMapping(value = "/sms",method=RequestMethod.POST)
	public ResponseEntity<?> sendSMS(@RequestBody Sms massage){
		massage.print();
		return new ResponseEntity<>(massage, HttpStatus.OK);
	}

}
