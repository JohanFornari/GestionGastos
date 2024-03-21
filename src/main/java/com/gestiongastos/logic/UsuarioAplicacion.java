package com.gestiongastos.logic;

import com.gestiongastos.models.Usuario;

public class UsuarioAplicacion extends AbsUsuario implements VistaUsuarioInterface {

	public UsuarioAplicacion(Usuario usuario) {
		super(usuario);
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

}
