package com.techprudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * @author tech prudent
 *
 *         Spring boot learnings,
 *         https://github.com/TechPrudent/spring-boot-learning
 * 
 */
@SpringBootApplication
public class SpringBootLearning  {

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

	public static void main(String[] args) {
		System.out.println("before main method run call");
		SpringApplication.run(SpringBootLearning.class, args);
		System.out.println("after main method run call");
	}
}
