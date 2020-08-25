package com.example.mytest;

/**
 * Class that creates an object which defines the vessel's name. The constructor takes a Vessel and transfer
 * the name over 
 * 
 * @author Sonsoles María
 * 
 *
 */

public class OutputVessel {
	public String name;

	public OutputVessel() {
		super();
		
	}
	
	public OutputVessel(Vessel vessel) {
		super();
		this.name=vessel.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
