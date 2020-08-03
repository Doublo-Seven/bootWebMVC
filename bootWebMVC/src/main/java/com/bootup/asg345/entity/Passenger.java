package com.bootup.asg345.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String emailAddress;
	private String firstName;
	private String gender;
	private String lastName;
	private int mobileNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId")
	private BookingRecord bookingId;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passengerId, String emailAddress, String firstName, String gender, String lastName,
			int mobileNumber, BookingRecord bookingId) {
		super();
		this.passengerId = passengerId;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.bookingId = bookingId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public BookingRecord getBookingId() {
		return bookingId;
	}

	public void setBookingId(BookingRecord bookingId) {
		this.bookingId = bookingId;
	}
	
}
