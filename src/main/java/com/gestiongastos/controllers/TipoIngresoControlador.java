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
import com.gestiongastos.models.TipoIngreso;
import com.gestiongastos.repository.TipoIngresoRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TipoIngresoControlador {

	
	@Autowired
	private TipoIngresoRepositorio servicioTipoIngreso;

	@GetMapping(value = "tipo_ingreso")
	public List<TipoIngreso> ObtenerTipoIngresos() {

		return servicioTipoIngreso.findAll();
	}
	
	@PostMapping(value = "tipo_ingreso")
	public void crearTipoIngreso(@RequestBody TipoIngreso tipoIngreso) {
		servicioTipoIngreso.save(tipoIngreso);
	}
	
	@DeleteMapping(value = "tipo_ingreso/{id}")
	public void borrarTipoIngreso(@PathVariable int id) {
		servicioTipoIngreso.deleteById(id);
	}
}
