package com.gaston.superville.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaston.superville.dto.PersonaUpdateDTO;
import com.gaston.superville.model.Persona;
import com.gaston.superville.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {
	private static Logger LOG = LoggerFactory.getLogger(PersonaServiceImpl.class);

	@Autowired
	private IPersonaRepo repo;

	@Override
	public void registrar(Persona persona) {
		LOG.info("Se esta registrando la persona.");

		repo.save(persona);
	}

	@Override
	public List<Persona> buscarTodos() {
		LOG.info("Se obtienen todas las personas.");
		return repo.findAll();
	}

	@Override
	public void actualizar(PersonaUpdateDTO personaDTO) {
		LOG.info("Se esta actualizando la persona.");

		Persona persona = (repo.findById(personaDTO.getId())).get();
		persona.setNombre(personaDTO.getNombre());
		persona.setCorreo(personaDTO.getCorreo());
		persona.setTelefono(persona.getTelefono());
		repo.save(persona);
	}

	@Override
	public void eliminar(Integer id) {
		LOG.info("Se esta eliminando la persona.");

		if (repo.existsById(id)) {
			repo.deleteById(id);
		}

	}

}
