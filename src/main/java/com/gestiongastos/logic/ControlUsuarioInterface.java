package com.gestiongastos.logic;

import java.util.List;

import com.gestiongastos.models.Persona;

public interface ControlUsuarioInterface {

	public List<Persona> obtenerUsuarios(List<Persona> usuarios);

	public boolean actualizarUsuario(Persona usuario);

	public boolean eliminarUsuario(int id_usuario);

}
