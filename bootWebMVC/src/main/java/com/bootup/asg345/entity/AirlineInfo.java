package com.bootup.asg345.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AirlineInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId;
	private String airlineLogo;
	private String nameOfAirline;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "FlightsInfo",
			joinColumns = {@JoinColumn(name = "airlineId", referencedColumnName = "airlineId")},
			inverseJoinColumns = {@JoinColumn(name="flightInfoid", referencedColumnName="flightInfoId")})
	private List<FlightInfo> flightInfoList;
	
	public List<FlightInfo> getFlightInfoList() {
		return flightInfoList;
	}

	public void setFlightInfoList(List<FlightInfo> flightInfoList) {
		this.flightInfoList = flightInfoList;
	}

	public AirlineInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AirlineInfo(String airlineLogo, String nameOfAirline) {
		super();
		this.airlineLogo = airlineLogo;
		this.nameOfAirline = nameOfAirline;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}
	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}
	public String getNameOfAirline() {
		return nameOfAirline;
	}
	public void setNameOfAirline(String nameOfAirline) {
		this.nameOfAirline = nameOfAirline;
	}
	
	
}
