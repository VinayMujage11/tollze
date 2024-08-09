package com.tollze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdminDetails")
public class AdminDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String adminId;
	@Column
	private String password;
	@Column
	private String fullName;
	@Column
	private String email;
	@Column
	private String userName;
	@Column
	private String role;
	@Column
	private String uniqueIdentityType;
	@Column
	private String uniqueIdentityNumber;
	
	public String getUniqueIdentityType() {
		return uniqueIdentityType;
	}
	public void setUniqueIdentityType(String uniqueIdentityType) {
		this.uniqueIdentityType = uniqueIdentityType;
	}
	public String getUniqueIdentityNumber() {
		return uniqueIdentityNumber;
	}
	public void setUniqueIdentityNumber(String uniqueIdentityNumber) {
		this.uniqueIdentityNumber = uniqueIdentityNumber;
	}
	public AdminDetails(String password, String fullName, String email, String userName, String role,
			String uniqueIdentityType, String uniqueIdentityNumber) {
		super();
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.userName = userName;
		this.role = role;
		this.uniqueIdentityType = uniqueIdentityType;
		this.uniqueIdentityNumber = uniqueIdentityNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public AdminDetails(String adminId, String password, String fullName, String email, String userName, String role,
			String uniqueIdentityType, String uniqueIdentityNumber) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.userName = userName;
		this.role = role;
		this.uniqueIdentityType = uniqueIdentityType;
		this.uniqueIdentityNumber = uniqueIdentityNumber;
	}
	public AdminDetails() {
		super();
	}
	
	

}
