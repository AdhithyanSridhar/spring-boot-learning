package com.techprudent.profilebasedconfig;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Spring boot profile based initialization
 */
@Component
@Profile("dev")
public class DevClass {

	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n Profile DEV class is active \n");
	}
}
