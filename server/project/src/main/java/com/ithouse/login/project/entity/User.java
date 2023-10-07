package com.ithouse.login.project.entity;

import java.util.Date;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="T_USER")
public class User {
	
	@Id
	@Column(name= "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name = "AGE")
	private double age;
	
	@Column(name = "IS_ACTIVE")
	private int isActive;
	
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@ManyToMany
	@JoinTable(name = "USER_ROLE", 
	joinColumns = @JoinColumn(name ="USER_ID"),
	inverseJoinColumns = @JoinColumn(name="ROLE_ID"))
	private Set<Role> userRoleList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<Role> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(Set<Role> userRoleList) {
		this.userRoleList = userRoleList;
	}
	
	

}
