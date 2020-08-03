package com.bootup.asg345.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Fare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private String currency;
	private int fare;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfoid")
	private List<Flight> flightList;
	
	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}

	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fare(String currency, int fare) {
		super();
		this.currency = currency;
		this.fare = fare;
	}

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getFareId() {
		return fareId;
	}

}
