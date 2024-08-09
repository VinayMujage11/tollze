package com.tollze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VehicleDetailsAsPerUser")
public class VehicleDetailsAsPerUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleCount;
	@Column
	private String vehicleNumber;
	
	@Column
	private String userId;
	@Column
	private  String vehicleType;
	@Column
	private String vehicleRegistrationNumber;
	@Column
	private String vehicleModel;
	
	public int getVehicleCount() {
		return vehicleCount;
	}
	public void setVehicleCount(int vehicleCount) {
		this.vehicleCount = vehicleCount;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}
	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public VehicleDetailsAsPerUser( String vehicleNumber, String userId, String vehicleType,
			String vehicleRegistrationNumber, String vehicleModel) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.userId = userId;
		this.vehicleType = vehicleType;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.vehicleModel = vehicleModel;
	}
	public VehicleDetailsAsPerUser() {
		super();
	}
	
	

}
