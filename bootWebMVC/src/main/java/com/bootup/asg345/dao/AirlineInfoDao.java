package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.AirlineInfo;

public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Integer> {
	
	AirlineInfo findByNameOfAirline(String nameOfAirline);
	AirlineInfo findByAirlineId(int airlineId);

}
