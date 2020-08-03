package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.FlightInfo;

public interface FightInfoDao extends JpaRepository<FlightInfo, Integer> {

	FlightInfo findByFlightNumber(String flightNumber);
	
	FlightInfo findByFlightInfoid(int id);
}
