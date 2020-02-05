package com.gaston.superville.service;

import java.util.List;

import com.gaston.superville.model.Persona;

public interface IPersonaService {

	void registrar(Persona persona);

	List<Persona> buscarTodos();

	void actualizar(Persona persona);

	void eliminar(Integer id);
}
