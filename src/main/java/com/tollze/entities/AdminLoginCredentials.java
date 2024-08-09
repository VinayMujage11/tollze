package com.tollze.entities;

public class AdminLoginCredentials {
	private String adminId;
	private String password;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLoginCredentials(String adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}
	public AdminLoginCredentials() {
		super();
	}
}
