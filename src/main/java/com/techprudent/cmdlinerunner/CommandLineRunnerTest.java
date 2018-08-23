package com.techprudent.cmdlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerTest implements CommandLineRunner {

	@Autowired
	Helper helper;
	
	/*
	 * Command line runner interface method's implementation
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nrun method command line runner ");
		helper.line();
	}
}

@Component
class Helper {

	public void line() {
		System.out.println("\n=================================================\n");
	}
}
