package com.gaston.superville;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gaston.superville.service.IPersonaService;

@SpringBootTest
class SupervilleApplicationTests {

	@Autowired
	private IPersonaService service;
	
	
	@Test
	void contextLoads() {
		System.out.println("Inicio del test.");
		
//		service.registrar("gaston");
	}

}
