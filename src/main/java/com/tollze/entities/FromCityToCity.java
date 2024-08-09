package com.tollze.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DistanceBetnCities")
public class FromCityToCity {
	@Id
	private String RouteNo;
	@Column
	private String source;
	@Column
	private String tollPlaza1;
	@Column
	private String tollPlaza2;
	@Column
	private String destination;
	@Column
	private int distanceInKM;
	public String getRouteNo() {
		return RouteNo;
	}
	public void setRouteNo(String routeNo) {
		RouteNo = routeNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTollPlaza1() {
		return tollPlaza1;
	}
	public void setTollPlaza1(String tollPlaza1) {
		this.tollPlaza1 = tollPlaza1;
	}
	public String getTollPlaza2() {
		return tollPlaza2;
	}
	public void setTollPlaza2(String tollPlaza2) {
		this.tollPlaza2 = tollPlaza2;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistanceInKM() {
		return distanceInKM;
	}
	public void setDistanceInKM(int distanceInKM) {
		this.distanceInKM = distanceInKM;
	}
	public FromCityToCity(String routeNo, String source, String tollPlaza1, String tollPlaza2, String destination,
			int distanceInKM) {
		super();
		RouteNo = routeNo;
		this.source = source;
		this.tollPlaza1 = tollPlaza1;
		this.tollPlaza2 = tollPlaza2;
		this.destination = destination;
		this.distanceInKM = distanceInKM;
	}
	public FromCityToCity() {
		super();
	}
	

}
