package com.gaston.superville.service;

import com.gaston.superville.dto.EstadisticaDTO;

/**
 * Interface utilizado para obtener los totales.
 * @author gaston aguilar
 *
 */
public interface ITotalizadorService {
	/**
	 * Metodo que devuelve la cantidad de personas por genero y el porcentaje de argentinos.
	 * @return devuelve un EstadisticaDTO.
	 */
	EstadisticaDTO obtenerEstadisticas();
	
}
