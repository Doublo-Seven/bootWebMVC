package com.bootup.asg1.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String destination;
	private String duration;
	private LocalDate flightDate;
	private String flightNumber;
	
	private String origin;
	private LocalTime flightTime;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fareId")
	private Fare fareId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "flightInfoid")
	private FlightInfo fightInfoid;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "invId")
	private Inventory invId;
	
	public Flight() {
		super();
	}

	public Flight(String destination, String duration, LocalDate flightDate, String flightNumber, String origin, LocalTime flightTime,
			Fare fareId, FlightInfo fightInfoid, Inventory invId) {
		super();
		this.destination = destination;
		this.duration = duration;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.flightTime = flightTime;
		this.fareId = fareId;
		this.fightInfoid = fightInfoid;
		this.invId = invId;
	}

	public LocalTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Fare getFareId() {
		return fareId;
	}

	public void setFareId(Fare fareId) {
		this.fareId = fareId;
	}

	public FlightInfo getFightInfoid() {
		return fightInfoid;
	}

	public void setFightInfoid(FlightInfo fightInfoid) {
		this.fightInfoid = fightInfoid;
	}

	public Inventory getInvId() {
		return invId;
	}

	public void setInvId(Inventory invId) {
		this.invId = invId;
	}

	public int getId() {
		return id;
	}	
	
}
