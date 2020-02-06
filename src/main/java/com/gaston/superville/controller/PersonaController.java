package com.gaston.superville.controller;

import java.util.List;

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

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping
	public List<Persona> listar() {
		return service.buscarTodos();
	}

	@PostMapping
	public void registrar(@RequestBody PersonaRequestDTO persona) {
		service.registrar(persona);
	}

	@PutMapping
	public void modificar(@RequestBody PersonaUpdateDTO persona) {
		service.actualizar(persona);

	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);

	}
}
