 package com.gestiongastos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiongastos.logic.Usuario;
import com.gestiongastos.logic.UsuarioAdministrador;
import com.gestiongastos.models.Persona;
import com.gestiongastos.repository.UsuarioRepositorio;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositorio usuarioRepository;

	public void guardarUsuario(Persona usuario) {
		UsuarioAdministrador usuario_especifico;
		usuario_especifico = new UsuarioAdministrador(usuario);
		if (usuario_especifico.actualizarUsuario(usuario)) {
			usuarioRepository.save(usuario);
		}

	}

	public List<Persona> listarUsuarios() {

		List<Persona> usuarios = usuarioRepository.findAll();
		// UsuarioAdministrador usuario_especifico = new UsuarioAdministrador();

		return usuarios;
	}

	public Persona obtenerUsuario(Integer id) {

		return usuarioRepository.findById(id).get();
	}

	public void eliminarUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public boolean verificarUsuario(String correo, String password) {

		if (Usuario.verificarUsuario(listarUsuarios(), correo, password)) {
			return true;
		}

		return false;

	}

}
