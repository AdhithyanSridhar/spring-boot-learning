package com.techprudent.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author tech prudent
 * 
 *         Convenient way to handle exceptions with care
 *
 */
@RestControllerAdvice
public class TestRestControllerAdvice {

	private Logger logger = LoggerFactory.getLogger(TestRestControllerAdvice.class);

	/**
	 * {@link RuntimeException} is handled explicitly
	 * 
	 * @param e
	 * @return {@link ResponseEntity}, httpHeaders can also be added to the
	 *         responseEntity
	 */
	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<String> catchRuntimeException(Exception e) {

		logger.warn("TestRestControllerAdvice - catchRunTimeException method: " + e.getMessage());

		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
