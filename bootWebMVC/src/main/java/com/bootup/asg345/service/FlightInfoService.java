package com.bootup.asg345.service;

import com.bootup.asg345.entity.FlightInfo;

public interface FlightInfoService{

	FlightInfo findByFlightNumber(String flightNumber);
	
	FlightInfo findByFlightInfoid(int id);
}
