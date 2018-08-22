package com.techprudent;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tech prudent
 *
 *         Spring boot learnings,
 *         https://github.com/TechPrudent/spring-boot-learning
 * 
 */
@SpringBootApplication
public class WebServiceDemoApplication implements CommandLineRunner {

	/*
	 * ==================================== Contact and feedback:
	 * 
	 * https://www.youtube.com/channel/UCVyvT1t3p-ciOeInzaSbIcQ
	 * https://github.com/TechPrudent/ techprudent91@gmail.com
	 * https://trello.com/b/8QKy3byG/techprudent https://techprudent91.blogspot.com/
	 * https://www.facebook.com/techprudents/ https://twitter.com/techprudent
	 * https://www.linkedin.com/in/tech-prudent-37831216b/
	 * https://plus.google.com/u/0/114035390968854033062
	 * 
	 * ====================================
	 */

	@Autowired
	Helper helper;

	public static void main(String[] args) {
		System.out.println("before main method run call");
		SpringApplication.run(WebServiceDemoApplication.class, args);
		System.out.println("after main method run call");
	}

	/*
	 * Command line runner interface method's implementation
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run method command line runner ");
		helper.line();
	}
}

@Component
class Helper {

	public void line() {
		System.out.println("\n=================================================\n");
	}
}

@Component
class PropertyFile {

	@Value("${message}")
	private String message;

	@PostConstruct
	private void printIt() {
		System.out.println("\n" + message + "\n");
	}

}

/**
 * Spring boot profile based initialization
 */
@Component
@Profile("dev")
class DevClass {

	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n Profile DEV class is active \n");
	}
}

@Component
@Profile("prod")
class ProdClass {

	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n Profile PROD class is active \n");
	}
}
