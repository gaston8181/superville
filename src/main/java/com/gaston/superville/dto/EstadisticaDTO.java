package com.gaston.superville.dto;

import io.swagger.annotations.ApiModelProperty;

public class EstadisticaDTO {

	@ApiModelProperty(notes = "Representa la cantidad de mujeres existentes", required = true, example="10")
	private String cantMujeres;
	
	@ApiModelProperty(notes = "Representa la cantidad de hombres existentes", required = true, example="10")
	private String cantHombres;
	
	@ApiModelProperty(notes = "Representa el porcentaje de argentinos", required = true, example="50")
	private String porcentajeArgentinos;

	public String getCantMujeres() {
		return cantMujeres;
	}

	public void setCantMujeres(String cantMujeres) {
		this.cantMujeres = cantMujeres;
	}

	public String getCantHombres() {
		return cantHombres;
	}

	public void setCantHombres(String cantHombres) {
		this.cantHombres = cantHombres;
	}

	public String getPorcentajeArgentinos() {
		return porcentajeArgentinos;
	}

	public void setPorcentajeArgentinos(String porcentajeArgentinos) {
		this.porcentajeArgentinos = porcentajeArgentinos;
	}

}
