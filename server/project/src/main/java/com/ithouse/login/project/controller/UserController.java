package com.ithouse.login.project.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ithouse.login.project.entity.Role;
import com.ithouse.login.project.entity.User;
import com.ithouse.login.project.repo.UserRepo;
import com.ithouse.login.project.service.RoleService;

//@Controller
@RequestMapping("/save")
@RestController
//@NoRepositoryBean
public class UserController {
	
	Gson gson;
	
	{
		gson = new Gson();
	}

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		user.setCreateDate(new Date());
		user.setIsActive(0);
		return userRepo.save(user);
	}
	
	@PostMapping("/role")
	public Role saveRole(@RequestBody Role role) {
		System.out.println("come for save role. role name: "+role.getRoleName());
		
		return roleService.saveRole(role);
	}
	
////	@GetMapping("/alluser")
//	@GetMapping(value = "/alluser", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<User>> getAllUser(){
//		List<User> uList = userRepo.findAll();
//		uList.forEach(System.out::println);
//		return new ResponseEntity<>(uList, HttpStatus.OK);
//	}
	
	@GetMapping("/alluser")
//	@GetMapping(value = "/alluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAllUser(){
		List<User> uList = userRepo.findAll();
//		uList.forEach(System.out::println);
		System.out.println(gson.toJson(uList));
		return gson.toJson(uList);
	}

	@GetMapping("/finduser")
	 @ResponseBody
	public User getUserinformation(@RequestBody User user) {
		User db = userRepo.findById(user.getId()).orElse(new User());
		db.getUserRoleList().forEach(r-> System.out.println(r.toString()));
		return db;
	}
	
	
}
