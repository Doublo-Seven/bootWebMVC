package com.bootup.asg1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FlightInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightInfoid;
	private String flightNumber;
	private String flightType;
	private int numberofSeats;
	
	@OneToOne
	@JoinColumn(name = "airlineId")
	private AirlineInfo airlineInfo;
	
	public FlightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FlightInfo(String flightNumber, String flightType, int numberofSeats) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.numberofSeats = numberofSeats;
	}

	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public int getNumberofSeats() {
		return numberofSeats;
	}
	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}
	

}
