package com.gaston.superville.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gaston.superville.model.Persona;

/**
 * Repositorio que utiliza JPQL para consultas de cantidad , porcentajes ,etc.
 * @author gaston aguilar
 *
 */
public interface ITotalizadorRepo extends JpaRepository<Persona, Integer>{

	/**
	 * Metodo que obtiene la cantidad de personas de cada genero.
	 * @return Lista de objetos donde la posicion 1 es el id_genero y posicion 2 es la cantidad de posee.
	 */
	@Query("select per.genero.idGenero, count(*) from Persona per group by per.genero.idGenero" )
	List<Object[]> obtenerEstadisticas();
	
	/**
	 * Metodo que devuelve el porcentaje de argentinos.
	 * @return Devuelve un Long con el porcentaje de argentinos.
	 */
	@Query("select (select count(per.nacionalidad.idNacionalidad)*100/Count(s.idPersona) from Persona as s )  "
			+ "from Persona per"
			+ " where per.nacionalidad.idNacionalidad = 1"
			+ " group by per.nacionalidad.idNacionalidad")
	Long porcentajeArgentinos();


}
