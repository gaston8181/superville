package com.gaston.superville.dto;

import io.swagger.annotations.ApiModelProperty;

public class PersonaUpdateDTO {

	@ApiModelProperty(notes = "Representa el id de la persona a actualizar", required = true, example="1")
	private Integer id;
	
	@ApiModelProperty(notes = "Representa el nuevo nombre", required = true, example="Felipe")
	private String nombre;
	
	@ApiModelProperty(notes = "Representa el nuevo correo", required = true, example="correo2@gmail.com")
	private String correo;
	
	@ApiModelProperty(notes = "Representa el nuevo telefono.", required = true, example="46324632")
	private String telefono;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
