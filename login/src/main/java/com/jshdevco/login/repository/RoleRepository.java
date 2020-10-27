package com.jshdevco.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jshdevco.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}