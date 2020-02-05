package com.gaston.superville;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gaston.superville.service.IPersonaService;

@SpringBootApplication
public class SupervilleApplication{

	public static void main(String[] args) {
		SpringApplication.run(SupervilleApplication.class, args);
	}
	

}
