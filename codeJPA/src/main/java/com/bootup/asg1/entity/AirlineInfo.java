package com.bootup.asg1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AirlineInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId;
	private String airlineLogo;
	private String nameOfAirline;
	
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
