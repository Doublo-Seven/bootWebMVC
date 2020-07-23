package com.bootup.asg1.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.bootup.asg1.entity.Flight;

public interface FlightService {
	
	void saveAll(List<Flight> flights);
	
	List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
	
	List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate);
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
	
	List<Flight> findByFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination);
	
	List<Flight> findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate, LocalTime flightTime);
}
