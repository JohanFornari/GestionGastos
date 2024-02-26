package com.gestiongastos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestiongastos.models.Persona;
import com.gestiongastos.services.UsuarioService;

@RestController
public class LoginControlador {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping(value = "login")
	public String verificarUsuario(@RequestBody Persona user) {
		if (usuarioService.verificarUsuario(user.getEmail(), user.getPassword())) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

}
