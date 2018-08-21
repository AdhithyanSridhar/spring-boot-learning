package com.techprudent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/get")
	String get() {
		return "test";
	}

	static int i = 0;

	@GetMapping("/advice")
	ResponseEntity<String> getAdvice() {
		i++;
		if (i % 3 == 0) {
			throw new RuntimeException("Exception");
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}