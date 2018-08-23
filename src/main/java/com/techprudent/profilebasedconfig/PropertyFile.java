package com.techprudent.profilebasedconfig;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyFile {

	@Value("${message}")
	private String message;

	@PostConstruct
	private void printIt() {
		System.out.println("\n" + message + "\n");
	}

}