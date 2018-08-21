package com.techprudent.log;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogTest {

	Logger logger = LoggerFactory.getLogger(LogTest.class);
	
	@PostConstruct
	private void debugLog() {
		System.out.println("\n\n\n");
		
		logger.trace("TRACE Message");
        logger.debug("DEBUG Message");
        logger.info("INFO Message");
        logger.warn("WARN Message");
        logger.error("ERROR Message");
        
		System.out.println("\n\n\n");
	}
}
