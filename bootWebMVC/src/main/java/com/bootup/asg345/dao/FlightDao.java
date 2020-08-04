package com.bootup.asg345.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bootup.asg345.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer>{

	@Query(value = " from Flight f where f.flightNumber like :flightNumber and f.flightDate = :flightDate" )
	List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
	
	List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate);
	
	@Query(value = " SELECT f1 from Flight f1 LEFT JOIN  f1.fareId f2 where f1.origin = :origin and f1.destination = :destination and f1.flightDate = :flightDate order by f2.fare")
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate flightDate);
	
	List<Flight> findByFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination);
	
	List<Flight> findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate, LocalTime flightTime);
	
	List<Flight> findAllByFlightDateAndOriginAndDestination(LocalDate flightDate, String origin, String destination);
	
}
