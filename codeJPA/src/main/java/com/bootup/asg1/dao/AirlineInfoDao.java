package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.AirlineInfo;

public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Integer> {
	
	AirlineInfo findByNameOfAirline(String nameOfAirline);
	AirlineInfo findByAirlineId(int airlineId);

}
