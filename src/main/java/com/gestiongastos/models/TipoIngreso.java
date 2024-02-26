package com.gestiongastos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_ingresos")
public class TipoIngreso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoIngreso;
	private String nombreTipoIngreso;
	
	public TipoIngreso() {
		super();
	}
	public TipoIngreso(int idTipoIngreso, String nombreTipoIngreso) {
		super();
		this.idTipoIngreso = idTipoIngreso;
		this.nombreTipoIngreso = nombreTipoIngreso;
	}
	public int getIdTipoIngreso() {
		return idTipoIngreso;
	}
	public void setIdTipoIngreso(int idTipoIngreso) {
		this.idTipoIngreso = idTipoIngreso;
	}
	public String getNombreTipoIngreso() {
		return nombreTipoIngreso;
	}
	public void setNombreTipoIngreso(String nombreTipoIngreso) {
		this.nombreTipoIngreso = nombreTipoIngreso;
	}

}
