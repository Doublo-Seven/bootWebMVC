package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{

}
