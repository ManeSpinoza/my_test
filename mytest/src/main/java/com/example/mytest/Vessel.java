package com.example.mytest;

/**
 * Internal class that creates the object vessel, which contains the vessel's name and the country's name
 * @author Sonsoles María Mangue
 *	
 *
 */
public class Vessel {
	public String country;
	public String name;
	
	
	public Vessel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
