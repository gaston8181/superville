package com.gaston.superville.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaston.superville.constant.ConstantGenero;
import com.gaston.superville.dto.EstadisticaDTO;
import com.gaston.superville.repository.ITotalizadorRepo;

@Service
public class TotalizadorServiceImpl implements ITotalizadorService {

	@Autowired
	private ITotalizadorRepo repo;

	@Transactional
	@Override
	public EstadisticaDTO obtenerEstadisticas() {
		List<Object[]> data = repo.obtenerEstadisticas();
		Long porcArgentinos = repo.porcentajeArgentinos();
		
		EstadisticaDTO estadistica = new EstadisticaDTO();
		estadistica.setCantHombres(this.getCantidad(ConstantGenero.MASCULINO, data));
		estadistica.setCantMujeres(this.getCantidad(ConstantGenero.FEMENINO, data));
		estadistica.setPorcentajeArgentinos(porcArgentinos.toString());
		
		return estadistica;
	}
	
	private String getCantidad(Integer genero, List<Object[]> lista) {
		String respuesta = "";
		for(Object[] aux:lista) {
			if(aux[0] == genero) {
				respuesta = ((Long) aux[1]).toString();
			}
			
		}
		
		return respuesta;
	}

}
