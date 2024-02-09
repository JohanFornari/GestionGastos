package com.gestiongastos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestiongastos.models.Usuario;
import com.gestiongastos.services.UsuarioService;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "usuario/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable int id) {

		try {
			Usuario usuario = usuarioService.obtenerUsuario(id);
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "usuarios")
	public List<Usuario> getUsuarios() {

		return usuarioService.listarUsuarios();
	}

	@PostMapping(value = "usuario")
	public void crearUsuario(@RequestBody Usuario user) {
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);
		String hash = argon2.hash(1, 1024, 1, user.getPassword());
		user.setPassword(hash);
		usuarioService.guardarUsuario(user);
	}

	@DeleteMapping(value = "usuario/{id}")
	public void borrarUsuario(@PathVariable int id) {
		usuarioService.eliminarUsuario(id);
	}

}
