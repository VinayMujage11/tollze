package com.tollze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(nullable = false, length = 50)
	private String fullName;
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	@Column(nullable = false,unique = true , length = 50)
	private String contact_Number;
	@Column(nullable = false, length = 50)
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User( String fullName, String email, String contact_Number, String password) {
		this.fullName = fullName;
		this.email = email;
		this.contact_Number = contact_Number;
		this.password = password;
	}
//	public User(String email, String password) {
//		this.email = email;
//		this.password = password;
//	}
//	
	
}
