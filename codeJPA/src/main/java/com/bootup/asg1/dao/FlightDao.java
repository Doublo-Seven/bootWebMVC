package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer>{

}
