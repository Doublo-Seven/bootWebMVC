package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.Fare;

public interface FareDao extends JpaRepository<Fare, Integer> {

	Fare findByFareId(int fareId);
}
