package com.ithouse.login.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithouse.login.project.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
