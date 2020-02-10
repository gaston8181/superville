package com.gaston.superville.dto;

import io.swagger.annotations.ApiModelProperty;

public class PersonaRequestDTO {
	
	@ApiModelProperty(notes = "Representa el id de la persona. Valor unico", required = true, example="1")
	private Integer idPersona;

	@ApiModelProperty(notes = "Representa el nombre de la persona", required = true, example="Gaston")
	private String nombre;

	@ApiModelProperty(notes = "Representa el id del tipo documento", required = true, example="1")
	private Integer idTipoDoc;

	@ApiModelProperty(notes = "Representa el numero de documento", required = true, example="33666999")
	private String nroDoc;

	@ApiModelProperty(notes = "Representa id de la nacionalidad", required = true, example="1")
	private Integer idNacionalidad;

	@ApiModelProperty(notes = "Representa id del genero", required = true, example="1")
	private Integer idGenero;

	@ApiModelProperty(notes = "Representa el correo electronico", required = true, example="agui.gaston@gmail.com")
	private String correo;

	@ApiModelProperty(notes = "Representa el telefono de contacto", required = true, example="113334444")
	private String telefono;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}

	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public Integer getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(Integer idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
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
