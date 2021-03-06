package com.dialog.ezcash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dialog.ezcash.domain.Ezcash;



@RestController
@RequestMapping(value = "/epay")
@CrossOrigin(origins = "*")
public class Ezcashcontroller {
	
	@RequestMapping(value = "/ezcach",method=RequestMethod.POST)
	public ResponseEntity<?> makepayment(@RequestBody Ezcash pay){
		pay.print();
		String a="ok";
		if("ok".equalsIgnoreCase(a)) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(null, HttpStatus.FAILED_DEPENDENCY);
		
	}

}
