package com.tollze.entities;

import jakarta.persistence.Column;

public class NewAdmin {

	@Column
	private String fullName;
	@Column
	private String email;
	@Column
	private String role;
	@Column
	private String uniqueIdentityType;
	@Column
	private String uniqueIdentityNumber;
	public NewAdmin(String fullName, String email, String role, String uniqueIdentityType,
			String uniqueIdentityNumber) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.role = role;
		this.uniqueIdentityType = uniqueIdentityType;
		this.uniqueIdentityNumber = uniqueIdentityNumber;
	}
	public NewAdmin() {
		super();
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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
	
}
