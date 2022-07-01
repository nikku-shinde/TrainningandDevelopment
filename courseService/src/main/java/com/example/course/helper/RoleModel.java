package com.example.course.helper;

public class RoleModel {

	private Long id;
	private String role_name;

	public RoleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleModel(Long id, String role_name) {
		super();
		this.id = id;
		this.role_name = role_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	
}
