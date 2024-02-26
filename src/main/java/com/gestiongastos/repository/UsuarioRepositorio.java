package com.gestiongastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiongastos.models.Persona;

public interface UsuarioRepositorio extends JpaRepository<Persona, Integer> {

}
