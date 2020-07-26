package com.bootup.asg1.service;

import com.bootup.asg1.entity.FlightInfo;

public interface FlightInfoService{

	FlightInfo findByFlightNumber(String flightNumber);
	
	FlightInfo findByFlightInfoid(int id);
}
