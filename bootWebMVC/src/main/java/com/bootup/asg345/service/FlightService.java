package com.bootup.asg345.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.bootup.asg345.entity.Flight;

public interface FlightService {
	
	Flight save(Flight flight);
	
	List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
	
	List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate);
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
	
	List<Flight> findByFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination);
	
	List<Flight> findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate, LocalTime flightTime);
}
