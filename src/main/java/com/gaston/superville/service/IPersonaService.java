package com.gaston.superville.service;

import java.util.List;

import com.gaston.superville.dto.PersonaRequestDTO;
import com.gaston.superville.dto.PersonaUpdateDTO;
import com.gaston.superville.model.Persona;

/**
 * Service utilizado para metodos CRUD, asociacion y determinacion de parentezco.
 * @author gaston aguilar
 *
 */
public interface IPersonaService {

	/**
	 * Metodo utilizado para registrar una persona en la base.
	 * @param persona espera un objeto PersonaRequestDTO para insertar en la base Persona
	 */
	void registrar(PersonaRequestDTO persona);

	/**
	 * Metodo que devuelve todas las personas existentes.
	 * @return devuelve un Lis<Persona> .
	 */
	List<Persona> buscarTodos();

	/**
	 * Metodo para actualizar la persona.
	 * @param persona Espera un PersonaUpdateDTO.
	 */
	void actualizar(PersonaUpdateDTO persona);

	/**
	 * Metodo para eliminar una persona existente en la base.
	 * @param id Espera el id de la persona a eliminar.
	 */
	void eliminar(Integer id);

	/**
	 * Metodo para obtener el parentezco.
	 * @param id1 id de la persona a comparar con id2
	 * @param id2 id de la persona a comparar con id1
	 * @return devuelve un String que contiene el parentezco.
	 */
	String relacion(Integer id1, Integer id2);

	/**
	 * Metodo para asignar un padre a un hijo.
	 * @param padre id de la persona.
	 * @param hijo id de la persona.
	 */
	void registrarPadre(Integer padre, Integer hijo);

}
