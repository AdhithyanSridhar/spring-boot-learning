package com.techprudent.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

	private Logger logger = LoggerFactory.getLogger(SecurityController.class);

	
	@Autowired
	private UserDetailsService userDetailService;
	
	@GetMapping("/test")
	String doSecurityTest() {

		logger.info("doSecurityTest method: logged in user details: " + 
		userDetailService.loadUserByUsername("user").toString());

		return "Security test";
	}

}
