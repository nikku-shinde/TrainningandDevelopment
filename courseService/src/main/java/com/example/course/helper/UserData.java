package com.example.course.helper;

public class UserData {

	private Long id;
	private String name;
	private String email;
	private String userName;
	private String password;
	private Long departmentId;
	private String profile;
	private RoleModel roles;

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(Long id, String name, String email, String userName, String password, Long departmentId,
			String profile, RoleModel roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.departmentId = departmentId;
		this.profile = profile;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public RoleModel getRoles() {
		return roles;
	}

	public void setRoles(RoleModel roles) {
		this.roles = roles;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
