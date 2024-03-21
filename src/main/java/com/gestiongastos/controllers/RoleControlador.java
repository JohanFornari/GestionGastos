package com.gestiongastos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gestiongastos.models.Role;
import com.gestiongastos.repository.RoleRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RoleControlador {
	@Autowired
	private RoleRepositorio roleService;

	@GetMapping(value = "role")
	public List<Role> getRoles() {

		return roleService.findAll();
	}
	
	@PostMapping(value = "role")
	public void crearRole(@RequestBody Role role) {
		roleService.save(role);
	}
	
	@DeleteMapping(value = "role/{id}")
	public void borrarRole(@PathVariable int id) {
		roleService.deleteById(id);
	}
	
}
