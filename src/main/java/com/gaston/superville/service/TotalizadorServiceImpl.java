package com.gaston.superville.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaston.superville.dto.EstadisticaDTO;
import com.gaston.superville.repository.IPersonaRepo;

@Service
public class TotalizadorServiceImpl implements ITotalizadorService {

	@Autowired
	private IPersonaRepo repo;

	@Override
	public EstadisticaDTO obtenerEstadisticas() {
		// TODO Auto-generated method stub
		return null;
	}

}
