package com.eval.coronakit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eval.coronakit.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, String> {
	Roles findByRole(@Param("role") String role);
}
