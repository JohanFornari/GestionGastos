package com.gestiongastos.models;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ingresos")
public class Ingreso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIngreso;
	private float valor;
	private String descripcion;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE )
	private Date fechaIngreso; 
	@ManyToOne
	@JoinColumn(name = "tipo_ingresos")
	private TipoIngreso tipoIngreso;
	@ManyToOne
	@JoinColumn(name = "usuarios")
	private Persona usuario;
	
	public Ingreso() {
		super();
	}
	
	public Ingreso(int idIngreso, float valor, String descripcion, Date fechaIngreso, TipoIngreso tipoIngreso,
			Persona usuario) {
		super();
		this.idIngreso = idIngreso;
		this.valor = valor;
		this.descripcion = descripcion;
		this.fechaIngreso = fechaIngreso;
		this.tipoIngreso = tipoIngreso;
		this.usuario = usuario;
	}
	
	public int getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public TipoIngreso getTipoIngreso() {
		return tipoIngreso;
	}
	public void setTipoIngreso(TipoIngreso tipoIngreso) {
		this.tipoIngreso = tipoIngreso;
	}
	public Persona getUsuario() {
		return usuario;
	}
	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}
	
	
}
