package com.gestiongastos.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	private String nombre; 
	private int privilegio;
	
	
	public Role(int id_role, String nombre, int privilegio) {
		this.idRole = id_role;
		this.nombre = nombre;
		this.privilegio = privilegio;
	}
	
	public Role() {
		super();
	}
	
	public int getId_role() {
		return idRole;
	}
	public void setId_role(int id_role) {
		this.idRole = id_role;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	} 
	
	
}
