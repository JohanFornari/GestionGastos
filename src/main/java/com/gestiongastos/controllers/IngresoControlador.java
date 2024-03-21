package com.gestiongastos.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestiongastos.models.Ingreso;
import com.gestiongastos.models.TipoIngreso;
import com.gestiongastos.repository.IngresoRepositorio;
import com.gestiongastos.repository.TipoIngresoRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class IngresoControlador {

		
	@Autowired
	private IngresoRepositorio servicioIngreso;

	@GetMapping(value = "ingreso/{id}")
	public List<Ingreso> ObtenerIngresos(@PathVariable int id) {

		List<Ingreso> ingresos= servicioIngreso.findAll();
		List<Ingreso> ingresos_usuario = new ArrayList<Ingreso>();
		for (Ingreso ingreso : ingresos) {
			
			if (ingreso.getUsuario().getId() == id) {
				ingresos_usuario.add(ingreso);
			}
		}
		return ingresos_usuario;
	}
		
	@PostMapping(value = "ingreso")
	public void crearIngreso(@RequestBody Ingreso ingreso) {
		servicioIngreso.save(ingreso);
	}
		
	@DeleteMapping(value = "ingreso/{id}")
	public void borrarIngreso(@PathVariable int id) {
		servicioIngreso.deleteById(id);
	}
	

}
