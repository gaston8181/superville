package com.gaston.superville.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaston.superville.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
