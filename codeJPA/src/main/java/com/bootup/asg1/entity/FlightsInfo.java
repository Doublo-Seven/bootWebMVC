package com.bootup.asg1.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class FlightsInfo {
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airlineId")
	private AirlineInfo airlineId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfoid")
	private FlightInfo flightInfoid;
	
	public FlightsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightsInfo(AirlineInfo airlineId, FlightInfo flightInfoid) {
		super();
		this.airlineId = airlineId;
		this.flightInfoid = flightInfoid;
	}

	public AirlineInfo getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(AirlineInfo airlineId) {
		this.airlineId = airlineId;
	}

	public FlightInfo getFlightInfoid() {
		return flightInfoid;
	}

	public void setFlightInfoid(FlightInfo flightInfoid) {
		this.flightInfoid = flightInfoid;
	}
	
}
