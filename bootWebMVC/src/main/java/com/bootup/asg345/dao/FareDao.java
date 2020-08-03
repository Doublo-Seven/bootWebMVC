package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.Fare;

public interface FareDao extends JpaRepository<Fare, Integer> {

	Fare findByFareId(int fareId);
}
