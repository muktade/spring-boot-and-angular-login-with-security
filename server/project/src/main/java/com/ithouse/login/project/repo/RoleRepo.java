package com.ithouse.login.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ithouse.login.project.entity.Role;

//@NoRepositoryBean
public interface RoleRepo extends JpaRepository<Role, Long> {

}
