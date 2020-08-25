package com.example.mytest;
/**
 * This class determines the output format of the POST
 * @author falco
 * 
 *
 */
public class OutputModel {
	public OutputVessel vessel;
	public OutputPosition position;
	
	public OutputModel() {
		super();
	}

	public OutputModel(Vessel vessel, Position position) {
		super();
		this.vessel = new OutputVessel(vessel);
		this.position = new OutputPosition(position);
	}

	public OutputVessel getVessel() {
		return vessel;
	}

	public void setVessel(OutputVessel vessel) {
		this.vessel = vessel;
	}

	public OutputPosition getPosition() {
		return position;
	}

	public void setPosition(OutputPosition position) {
		this.position = position;
	}
	
}
