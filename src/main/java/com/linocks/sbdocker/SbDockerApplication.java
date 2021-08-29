package com.linocks.sbdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SbDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDockerApplication.class, args);
	}

}

@RestController
class HomeController{

	@GetMapping
	public String home(){
		return "Welcome to Dockerized Spring Boot App with Jenkins";
	}

	@GetMapping("/family")
	public List<String> getFamily(){
		return Arrays.asList("Enock", "Samuel", "Betty", "Harriet", "Doris");
	}

	@GetMapping("/spouse")
	public String getSpouse(){
		return "Ruby";
	}
}
