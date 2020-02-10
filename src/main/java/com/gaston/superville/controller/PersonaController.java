package com.gaston.superville.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaston.superville.dto.PersonaRequestDTO;
import com.gaston.superville.dto.PersonaUpdateDTO;
import com.gaston.superville.model.Persona;
import com.gaston.superville.service.IPersonaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Api rest
 * Controller posee todas las operaciones CRUD, ademas permite asignarle un padre a un hijo.
 * @author gaston aguilar
 *
 */
@RestController
@RequestMapping("/personas")
public class PersonaController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

	@Autowired
	private IPersonaService service;

	/**
	 * Obtiene todas las personas en la base.
	 * pre-condiciones: deben existir datos en la base.
	 * @return devuelve todas las personas que existen en la base.
	 */
	@ApiOperation(value = "Devuelve la lista de todas las personas.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@GetMapping
	public List<Persona> listar() {
		LOGGER.info("Se invoca al service para obtener las personas.");
		return service.buscarTodos();
	}

	/**
	 * Operacion para registrar una persona en la base.
	 * pre-condicion: no se deben enviar datos incompletos, ni debe existir el id en la base.
	 * @param persona Se envia un PersonaRequestDTO que tiene los datos para guardar.
	 */
	@ApiOperation(value = "Inserta una persona en la base.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@PostMapping
	public void registrar(@RequestBody PersonaRequestDTO persona) {
		LOGGER.info("Se invoca al service para registrar la persona.");
		service.registrar(persona);
	}

	/**
	 * Permite modificar la persona en base al id enviado. Solo modificac nombre, correo y telefono.
	 * @param persona Se envia un PersonaUpdateDTO que contiene los datos a modificar.
	 */
	@ApiOperation(value = "Modifica los datos de una persona. Solo modificac nombre, correo y telefono.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@PutMapping
	public void modificar(@RequestBody PersonaUpdateDTO persona) {
		LOGGER.info("Se invoca al service para actualizar la persona.");
		service.actualizar(persona);

	}

	/**
	 * Permite eliminar una persona de la base.
	 * pre- condicion : la persona debe existir previamente.
	 * @param id id de la persona a eliminar
	 */
	@ApiOperation(value = "Elimina una persona de la base por id.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		LOGGER.info("Se invoca al service para eliminar la persona.");
		service.eliminar(id);

	}
	
	/**
	 * Le asigna el padre a un hijo.
	 * pre-condicion: deben existir los id y no deben tener padres.
	 * @param id1 corresponde al id del padre.
	 * @param id2 corresponde al id del hijo.
	 */
	@ApiOperation(value = "Le asigna el padre a un hijo.", consumes = "application/json")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 400, message = "Bad Request"), 
			@ApiResponse(code = 500, message = "Internal Error") })
	@PostMapping(value = "/{id1}/padre/{id2}")
	public void registrarPadre(@PathVariable("id1") Integer id1, @PathVariable("id2") Integer id2) {
		LOGGER.info("Se invoca al service para registrar el padre.");
		service.registrarPadre(id1, id2);
	}
}
