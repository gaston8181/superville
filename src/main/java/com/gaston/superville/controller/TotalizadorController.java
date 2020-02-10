package com.gaston.superville.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaston.superville.dto.EstadisticaDTO;
import com.gaston.superville.service.ITotalizadorService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controller utilizado para obtener cualquier tipo de estadisticas.
 * @author gaston aguilar
 *
 */
@RestController
@RequestMapping("/estadisticas")
public class TotalizadorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TotalizadorController.class);
	
	@Autowired
	private ITotalizadorService service;
	
	/**
	 * Metodo para obtener la cantidad de hombre, mujeres y porcentajes de argentinos.
	 * @return Devuelve la cantidad de hombres, mujeres y  porcentajes de argentinos.
	 */
	@ApiOperation(value = "Devuelve la cantidad de hombres, mujeres y  porcentajes de argentinos.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@GetMapping
	public EstadisticaDTO estadisticas() {
		LOGGER.info("Se invoca al service para obtener las estadisticas.");
		return service.obtenerEstadisticas();
	}
}
