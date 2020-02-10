package com.gaston.superville.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaston.superville.service.IPersonaService;

@RestController
@RequestMapping("/relaciones")
public class RelacionadorController {

	@Autowired
	private IPersonaService service;

	@GetMapping(value = "/{id1}/{id2}")
	public String relacion(@PathVariable("id1") Integer id1, @PathVariable("id2") Integer id2) {
		return service.relacion(id1, id2);
	}
}
