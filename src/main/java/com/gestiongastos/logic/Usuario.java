package com.gestiongastos.logic;

import java.util.List;

import com.gestiongastos.models.Persona;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public abstract class Usuario {

	private Persona usuario;

	public abstract Persona actualizarUsuario(Persona usuario, String direccion, String telefono);

	public static boolean verificarUsuario(List<Persona> usuario, String correo, String password) {

		if (!correo.isEmpty() && !password.isEmpty()) {
			for (Persona u : usuario) {
				if (u.getEmail().equals(correo)) {
					Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);

					if (argon2.verify(u.getPassword(), password)) {
						return true;
					}
				}
			}
		}
		return false;

	}

	public Usuario(Persona usuario) {
		this.usuario = usuario;
	}

	public Usuario() {
	}

	public Persona getUsuario() {
		return usuario;
	}

	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

}
