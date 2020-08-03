package com.bootup.asg345.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class BookingRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private LocalDateTime bookingDate;
	private String destination;
	private int fare;
	private LocalDate flightDate;
	private String flightNumber;
	private LocalTime flightTime;
	private String origin;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "BookingDetails",
	joinColumns = {@JoinColumn(name="bookingId", referencedColumnName = "bookingId")},
	inverseJoinColumns = {@JoinColumn(name = "passengerId", referencedColumnName = "passengerId")})
	private List<Passenger> passengerList;
	
	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public BookingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingRecord(LocalDateTime bookingDate, String destination, int fare, LocalDate flightDate,
			String flightNumber, LocalTime flightTime, String origin, String status) {
		super();
		this.bookingDate = bookingDate;
		this.destination = destination;
		this.fare = fare;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.origin = origin;
		this.status = status;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
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

	public LocalTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	

}
