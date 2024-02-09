package com.gestiongastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiongastos.models.Role;

public interface RoleRepositorio extends JpaRepository<Role, Integer> {

}
