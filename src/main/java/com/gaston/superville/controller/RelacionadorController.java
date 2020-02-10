package com.gaston.superville.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaston.superville.service.IPersonaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controller para obtener las relaciones.
 * @author gaston aguilar
 *
 */
@RestController
@RequestMapping("/relaciones")
public class RelacionadorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RelacionadorController.class);
	
	@Autowired
	private IPersonaService service;

	/**
	 * Endpoint para obtener el parentezco entre las personas
	 * pre-condicion: las personas a consultar deben tener padres y solo las posibles relaciones
	 * que existen son herman@ prim@ y ti@ .
	 * 
	 * @param id1 id de la persona a comparar.
	 * @param id2 id de la persona a comparar.
	 * @return
	 */
	@ApiOperation(value = "Indica la relacion, si es herma@ prim@ o ti@. ", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@GetMapping(value = "/{id1}/{id2}")
	public String relacion(@PathVariable("id1") Integer id1, @PathVariable("id2") Integer id2) {
		LOGGER.info("Se invoca al service obtener la relacion.");
		return service.relacion(id1, id2);
	}
}
