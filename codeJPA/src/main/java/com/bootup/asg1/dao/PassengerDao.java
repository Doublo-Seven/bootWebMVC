package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{

}
