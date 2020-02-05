package com.gaston.superville.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaston.superville.dto.EstadisticaDTO;
import com.gaston.superville.service.ITotalizadorService;

@RestController
@RequestMapping("/estadisticas")
public class TotalizadorController {
	@Autowired
	private ITotalizadorService service;
	
	@GetMapping
	public EstadisticaDTO estadisticas() {
		return service.obtenerEstadisticas();
	}
}
