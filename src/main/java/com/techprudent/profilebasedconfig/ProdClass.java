package com.techprudent.profilebasedconfig;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdClass {

	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n Profile PROD class is active \n");
	}
}