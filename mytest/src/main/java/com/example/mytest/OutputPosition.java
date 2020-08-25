package com.example.mytest;

import java.time.Instant;
import java.util.Date;
/**
 * This class defines de position for OutputModel. The constructor of this moves all the values from Position
 *  into instances of OutputPosition
 * @author falco
 *
 */
public class OutputPosition {
	public Date date;
	public Instant currentDate= Instant.now();
	public double latitude;
	public double longitude;
	public double speed;
	
	public OutputPosition() {
		super();
	}
	
	public OutputPosition(Position position) {
		super();
		this.date = position.date;
		this.currentDate = position.currentDate;
		this.latitude = position.latitude;
		this.longitude = position.longitude;
		this.speed = position.speed;
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

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
