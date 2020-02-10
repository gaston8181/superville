package com.gaston.superville.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaston.superville.model.Persona;

/**
 * Repositorio que utiliza todas las operaciones crud de jpa para la persona.
 * @author gaston aguilar
 *
 */
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
