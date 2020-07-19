package com.bootup.asg1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invId;
	private int count;
	

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
	
}
