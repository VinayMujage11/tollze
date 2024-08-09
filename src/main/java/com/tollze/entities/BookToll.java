package com.tollze.entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TollBookDetails")
public class BookToll {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tollCount;
	@Column
	private String tollBookId;
	@Column(nullable=false)
	private String userId;
	@Column(nullable = false, length = 50)
	private String source;
	@Column(nullable = false,  length = 50)
	private String destination;
	@Column(nullable = false)
	private Date journeydate;
	@Column(nullable = false , length = 50)
	private String vehicleType;
	@Column(nullable = false, length = 50)
	private String vehicleNumber;
	@Column(nullable = false, length = 50)
	private String vehicleLicenseNumber;
	@Column(nullable = false, length = 50)
	private String paymentMode;
	@Column
	private float amountToBePaid;
	@Column
	private String paymentStatus;
	@Column
	private Date dateOfbooking;
	@Column 
	private Date dateOfExpiry;
	@Column
    private int distanceInKM;
	
	
	public int getDistanceInKM() {
		return distanceInKM;
	}
	public void setDistanceInKM(int distanceInKM) {
		this.distanceInKM = distanceInKM;
	}
	public Date getDateOfbooking() {
		return dateOfbooking;
	}
	public void setDateOfbooking(Date dateOfbooking) {
		this.dateOfbooking = dateOfbooking;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public float getAmountToBePaid() {
		return amountToBePaid;
	}
	public void setAmountToBePaid(float amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTollBookId() {
		return tollBookId;
	}
	public void setTollBookId(String tollBookId) {
		this.tollBookId = tollBookId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateofjourney() {
		return journeydate;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.journeydate = dateofjourney;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleLicenseNumber() {
		return vehicleLicenseNumber;
	}
	public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
		this.vehicleLicenseNumber = vehicleLicenseNumber;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getTollCount() {
		return tollCount;
	}
	public void setTollCount(int tollCount) {
		this.tollCount = tollCount;
	}
	public Date getJourneydate() {
		return journeydate;
	}
	public void setJourneydate(Date journeydate) {
		this.journeydate = journeydate;
	}
	
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//	public BookToll(String source, String destination, Date dateofjourney,
//			String vehicleType, String vehicleNumber, String vehicleLicenseNumber, String paymentMode,String TollBookId) {
//		super();
//		this.source = source;
//		this.destination = destination;
//		this.journeydate = dateofjourney;
//		//this.journeytime = timeofjourney;
//		this.vehicleType = vehicleType;
//		this.vehicleNumber = vehicleNumber;
//		this.vehicleLicenseNumber = vehicleLicenseNumber;
//		this.paymentMode = paymentMode;
//		this.TollBookId = TollBookId;
//		
//	}
	public BookToll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookToll(int tollCount, String tollBookId, String userId, String source, String destination,
			Date journeydate, String vehicleType, String vehicleNumber, String vehicleLicenseNumber, String paymentMode,
			float amountToBePaid, String paymentStatus, Date dateOfbooking, Date dateOfExpiry,int distanceInKM) {
		super();
		this.tollCount = tollCount;
		this.tollBookId = tollBookId;
		this.userId = userId;
		this.source = source;
		this.destination = destination;
		this.journeydate = journeydate;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.vehicleLicenseNumber = vehicleLicenseNumber;
		this.paymentMode = paymentMode;
		this.amountToBePaid = amountToBePaid;
		this.paymentStatus = paymentStatus;
		this.dateOfbooking = dateOfbooking;
		this.dateOfExpiry = dateOfExpiry;
		this.distanceInKM = distanceInKM;
	}	
	
}
//@Column(nullable = false , length = 50)
//private LocalDateTime timeOfBooking;
//@Column(nullable = false)
//private Time journeytime;
//@Column(nullable = false , length = 50)
//private LocalDate expiryDate;
//@Column(nullable = false, length = 50)
//private LocalTime expriyTime;	
//@Column(nullable = false, length = 50)
//private String paymentStatus;
//@Column(nullable = false, length = 50)
//private String billPaid;
//@Column(nullable = false, length = 50)
//private int distanceInKilometer;
//public LocalDateTime getTimeOfBooking() {
//return timeOfBooking;
//}
//public void setTimeOfBooking(LocalDateTime timeOfBooking) {
//this.timeOfBooking = timeOfBooking;
//}
//public Time getTimeofjourney() {
//return journeytime;
//}
//public void setTimeofjourney(Time timeofjourney) {
//this.journeytime = timeofjourney;
//}
//public LocalDate getExpiryDate() {
//return expiryDate;
//}
//public void setExpiryDate(LocalDate expiryDate) {
//this.expiryDate = expiryDate;
//}
//public LocalTime getExpriyTime() {
//return expriyTime;
//}
//public void setExpriyTime(LocalTime expriyTime) {
//this.expriyTime = expriyTime;
//}

