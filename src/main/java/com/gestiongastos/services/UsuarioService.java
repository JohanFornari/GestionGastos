 package com.gestiongastos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiongastos.logic.AbsUsuario;
import com.gestiongastos.logic.UsuarioAdministrador;
import com.gestiongastos.models.Usuario;
import com.gestiongastos.repository.UsuarioRepositorio;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositorio usuarioRepository;

	public void guardarUsuario(Usuario usuario) {
		UsuarioAdministrador usuario_especifico;
		usuario_especifico = new UsuarioAdministrador(usuario);
		if (usuario_especifico.actualizarUsuario(usuario)) {
			usuarioRepository.save(usuario);
		}

	}

	public List<Usuario> listarUsuarios() {

		List<Usuario> usuarios = usuarioRepository.findAll();
		// UsuarioAdministrador usuario_especifico = new UsuarioAdministrador();

		return usuarios;
	}

	public Usuario obtenerUsuario(Integer id) {

		return usuarioRepository.findById(id).get();
	}

	public void eliminarUsuario(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public Usuario verificarUsuario(String correo, String password) {

		return AbsUsuario.verificarUsuario(listarUsuarios(), correo, password);

	}

}
