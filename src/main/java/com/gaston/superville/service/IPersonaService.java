package com.gaston.superville.service;

import java.util.List;

import com.gaston.superville.dto.PersonaRequestDTO;
import com.gaston.superville.dto.PersonaUpdateDTO;
import com.gaston.superville.model.Persona;

public interface IPersonaService {

	void registrar(PersonaRequestDTO persona);

	List<Persona> buscarTodos();

	void actualizar(PersonaUpdateDTO persona);

	void eliminar(Integer id);
	
	String relacion(Integer id1, Integer id2);

}
