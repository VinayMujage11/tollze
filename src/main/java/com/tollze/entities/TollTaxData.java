package com.tollze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TollTaxesAsPerVehicles")
public class TollTaxData {
	@Id
	private String vehicleType;
	@Column
	private String vehicleSubType;
	@Column
	private float tollTaxPerKM;
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleSubType() {
		return vehicleSubType;
	}
	public void setVehicleSubType(String vehicleSubType) {
		this.vehicleSubType = vehicleSubType;
	}
	public float getTollTaxPerKM() {
		return tollTaxPerKM;
	}
	public void setTollTaxPerKM(float tollTaxPerKM) {
		this.tollTaxPerKM = tollTaxPerKM;
	}
	public TollTaxData(String vehicleType, String vehicleSubType, float tollTaxPerKM) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleSubType = vehicleSubType;
		this.tollTaxPerKM = tollTaxPerKM;
	}
	public TollTaxData() {
		super();
	}
	
	

}
