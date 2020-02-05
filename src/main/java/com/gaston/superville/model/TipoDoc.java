package com.gaston.superville.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoDoc {

	@Id
	private int idTipoDoc;

	@Column(name = "tipo_documento")
	private String descripcion;

	public int getIdTipoDoc() {
		return idTipoDoc;
	}

	public void setIdTipoDoc(int idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
