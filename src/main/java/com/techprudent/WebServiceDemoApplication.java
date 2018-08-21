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

@SpringBootApplication
public class WebServiceDemoApplication implements CommandLineRunner {

	@Autowired
	Helper helper;

	public static void main(String[] args) {
		System.out.println("before main method run call");
		SpringApplication.run(WebServiceDemoApplication.class, args);
		System.out.println("after main method run call");
	}

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
class PropertyFile{
	
	@Value("${message}")
	private String message;
	
	@PostConstruct
	private void printIt() {
		
		System.out.println("\n\n\n");
		System.out.println(message);
		System.out.println("\n\n\n");
	}
	
}


@Component
@Profile("dev")
class DevClass{
	
	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n\n\n Profile DEV class is active \n\n\n");
	}
	
}

@Component
@Profile("prod")
class ProdClass{
	
	@PostConstruct
	private void devClassMethod() {
		System.out.println("\n\n\n Profile PROD class is active \n\n\n");
	}
	
}

