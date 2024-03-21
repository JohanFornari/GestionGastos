package com.gestiongastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiongastos.models.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
