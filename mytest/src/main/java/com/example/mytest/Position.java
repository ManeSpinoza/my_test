package com.example.mytest;

import java.time.Instant;
import java.util.Date;
/**
 * Internal class that creates Position object 
 * @author Sonsoles María Mangue
 * 
 */
public class Position {
	public Date date;
	public Instant currentDate= Instant.now();
	public double latitude;
	public double longitude;
	public double speed;
	
	public Position() {
		super();
	}
	
	public Position(Date date, double longitude, double latitude,double speed) {
		super();
		this.date = date;
		this.speed = 0.514444*speed;
		this.longitude = Math.toRadians(longitude);
		this.latitude = Math.toRadians(latitude);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Instant getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Instant currentDate) {
		this.currentDate = currentDate;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}
	
	
	
}
