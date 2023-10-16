package com.ithouse.login.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithouse.login.project.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

//	default User saveUser(User user) {
//		user.setIsActive(1);
//		return saveEntity(user);
//	}
}
