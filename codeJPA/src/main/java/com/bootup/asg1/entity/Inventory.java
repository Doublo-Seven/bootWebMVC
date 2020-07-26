package com.bootup.asg1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invId;
	private int count;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfoid")
	private List<Flight> flightList;
	

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Inventory(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getInvId() {
		return invId;
	}
	
}
