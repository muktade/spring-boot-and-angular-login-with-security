package com.ithouse.login.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithouse.login.project.entity.Role;
import com.ithouse.login.project.repo.RoleRepo;

@Service
public class RoleService{

	@Autowired
	private RoleRepo roleRepo;

	public Role saveRole(Role role) {
		
		return roleRepo.save(role);
	}
	
	

}
