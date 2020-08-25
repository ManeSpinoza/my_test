package com.example.mytest;

/**
 * External class that creates object with the original format of the input data
 * @author Sonsoles María Mangue
 *
 */
public class InputModel {
	public Vessel vessel;
	public Position position;
	
	
	public InputModel() {
		super();
	}


	public Vessel getVessel() {
		return vessel;
	}


	public void setVessel(Vessel vessel) {
		this.vessel = vessel;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
