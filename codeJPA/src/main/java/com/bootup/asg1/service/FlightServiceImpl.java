package com.bootup.asg1.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg1.dao.FlightDao;
import com.bootup.asg1.entity.Fare;
import com.bootup.asg1.entity.Flight;

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
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Flight> cq = cb.createQuery(Flight.class);
		
		Root<Flight> flight = cq.from(Flight.class);
		Root<Fare> fare = cq.from(Fare.class);
		cq.multiselect(flight,fare);
		cq.where(cb.equal(flight.get("fare"), fare.get("fareId")));
		
		return null;
	}

}
