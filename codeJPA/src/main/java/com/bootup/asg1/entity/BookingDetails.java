package com.bootup.asg1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BookingDetails {
	@Id
	@OneToMany(targetEntity = BookingRecord.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId")
	private List<BookingRecord> bookingId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passengerId")
	private Passenger passengerId;

	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingDetails(List<BookingRecord> bookingId, Passenger passengerId) {
		super();
		this.bookingId = bookingId;
		this.passengerId = passengerId;
	}

	public List<BookingRecord> getBookingId() {
		return bookingId;
	}

	public void setBookingId(List<BookingRecord> bookingId) {
		this.bookingId = bookingId;
	}

	public Passenger getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Passenger passengerId) {
		this.passengerId = passengerId;
	}

	
}
