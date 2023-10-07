package com.ithouse.login.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithouse.login.project.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
