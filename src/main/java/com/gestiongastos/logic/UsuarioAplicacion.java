package com.gestiongastos.logic;

import com.gestiongastos.models.Persona;

public class UsuarioAplicacion extends Usuario implements VistaUsuarioInterface {

	public UsuarioAplicacion(Persona usuario) {
		super(usuario);
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

}
