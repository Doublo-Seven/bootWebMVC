package com.bootup.asg345.entity;

import javax.persistence.CascadeType;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airlineId")
	private AirlineInfo airlineInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfoid")
	private Flight flight;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
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

	public AirlineInfo getAirlineInfo() {
		return airlineInfo;
	}

	public void setAirlineInfo(AirlineInfo airlineInfo) {
		this.airlineInfo = airlineInfo;
	}

	public FlightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightInfo(String flightNumber, String flightType, int numberofSeats, AirlineInfo airlineInfo) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.numberofSeats = numberofSeats;
		this.airlineInfo = airlineInfo;
	}

	public int getFlightInfoid() {
		return flightInfoid;
	}
	

}
