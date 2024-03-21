package com.gestiongastos.logic;

import java.util.List;

import com.gestiongastos.models.Usuario;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public abstract class AbsUsuario {

	private Usuario usuario;

	public abstract Usuario actualizarUsuario(Usuario usuario, String direccion, String telefono);

	public static Usuario verificarUsuario(List<Usuario> usuario, String correo, String password) {

		if (!correo.isEmpty() && !password.isEmpty()) {
			for (Usuario u : usuario) {
				if (u.getEmail().equals(correo)) {
					Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);

					if (argon2.verify(u.getPassword(), password)) {
						return u;
					}
				}
			}
		}
		return null;

	}

	public AbsUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AbsUsuario() {
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
