package com.bootup.asg345.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Join;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.FlightDao;
//import com.bootup.asg345.entity.Fare;
import com.bootup.asg345.entity.Flight;

@Service
public class FlightServiceImpl implements FlightService {

	@PersistenceContext
	EntityManager em;
	
	@Autowired
	FlightDao flightDao;

	@Override
	public List<Flight> findAllByFlightNumberAndFlightDate(String flightNumber, LocalDate flightDate) {		
		return flightDao.findAllByFlightNumberAndFlightDate(flightNumber, flightDate);
	}

	@Override
	public List<Flight> findAllByOriginAndFlightDate(String Origin, LocalDate flightDate) {		
		return flightDao.findAllByOriginAndFlightDate(Origin, flightDate);
	}

	@Override
	public List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination,
			LocalDate flightDate) {
//	11	CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Flight> cq = cb.createQuery(Flight.class);
//		
//		Root<Flight> flight = cq.from(Flight.class);
//		Join<Flight, Fare> fare = flight.join("fareId");
//		Predicate p1 = cb.equal(flight.get("origin"),origin);
//		Predicate p2 = cb.equal(flight.get("destination"), destination);
//		Predicate p3 = cb.equal(flight.get("flightDate"), flightDate);
//		cq.orderBy(cb.asc(flight.get("fare"))).where(flight.get("origin"));
		
		
		return flightDao.findByOriginAndDestinationAndFlightDate(origin, destination, flightDate);
	}

	@Override
	public List<Flight> findByFlightNumberAndOriginAndDestination(String flightNumber, String origin, String destination) {
		return flightDao.findByFlightNumberAndOriginAndDestination(flightNumber, origin, destination);
	}

	@Override
	public List<Flight> findByFlightNumberAndFlightDateAndFlightTime(String flightNumber, LocalDate flightDate,
			LocalTime flightTime) {
		return flightDao.findByFlightNumberAndFlightDateAndFlightTime(flightNumber, flightDate, flightTime);
	}

	@Override
	public Flight save(Flight flight) {
		// TODO Auto-generated method stub
		return flightDao.save(flight);
	}

	@Override
	public List<Flight> findByFlightDateAndOriginAndDestination(LocalDate flightDate, String origin,
			String destination) {
		// TODO Auto-generated method stub
		return flightDao.findByFlightDateAndOriginAndDestination(flightDate, origin, destination);
	}

	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return flightDao.findAll();
	}


}
