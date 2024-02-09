package com.gestiongastos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gestiongastos.models.Role;
import com.gestiongastos.repository.RoleRepositorio;

@RestController
public class RoleController {
	@Autowired
	private RoleRepositorio roleService;

	@GetMapping(value = "roles")
	public List<Role> getRoles() {

		return roleService.findAll();
	}
	
	@PostMapping(value = "role")
	public void crearRole(@RequestBody Role role) {
		roleService.save(role);
	}
	
	@DeleteMapping(value = "role")
	public void borrarRoles() {
		roleService.deleteAll();
	}
	
}
