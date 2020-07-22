package com.bootup.asg1.service;

import java.time.LocalDate;
import java.util.List;

import com.bootup.asg1.entity.Flight;

public interface FlightService {
	
	List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
	
	List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate);
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
}
