package com.gestiongastos.logic;

import java.util.List;

import com.gestiongastos.models.Persona;

public class UsuarioAdministrador extends Usuario implements VistaUsuarioInterface, ControlUsuarioInterface {

	public UsuarioAdministrador(Persona usuario) {
		super(usuario);
	}

	public UsuarioAdministrador() {
		super();
	}

	@Override
	public Persona actualizarUsuario(Persona usuario, String direccion, String telefono) {

		if (usuario.getId() != 0) {
			usuario.setDireccion(direccion);
			usuario.setTelefono(telefono);
		}

		return usuario;
	}

	@Override
	public boolean obtenerUsuario(int id_usuario) {
		if (id_usuario != 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean actualizarUsuario(Persona usuario) {
		if (usuario.getNombre() != "null") {
			return true;
		}
		return false;
	}

	@Override
	public List<Persona> obtenerUsuarios(List<Persona> usuarios) {
		if (!usuarios.isEmpty()) {
			return usuarios;
		}
		return usuarios;

	}

	@Override
	public boolean eliminarUsuario(int id_usuario) {

		if (id_usuario != 0) {
			return true;
		}
		return false;
	}

}
