package com.gestiongastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiongastos.models.Ingreso;

public interface IngresoRepositorio extends JpaRepository<Ingreso, Integer>{

}
