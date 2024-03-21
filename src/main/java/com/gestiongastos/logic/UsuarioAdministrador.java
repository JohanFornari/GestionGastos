package com.gestiongastos.logic;

import java.util.List;

import com.gestiongastos.models.Usuario;

public class UsuarioAdministrador extends AbsUsuario implements VistaUsuarioInterface, ControlUsuarioInterface {

	public UsuarioAdministrador(Usuario usuario) {
		super(usuario);
	}

	public UsuarioAdministrador() {
		super();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario, String direccion, String telefono) {

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
	public boolean actualizarUsuario(Usuario usuario) {
		if (usuario.getNombre() != "null") {
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> obtenerUsuarios(List<Usuario> usuarios) {
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
