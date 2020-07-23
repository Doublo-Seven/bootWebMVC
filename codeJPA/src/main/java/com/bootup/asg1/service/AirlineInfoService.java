package com.bootup.asg1.service;

import com.bootup.asg1.entity.AirlineInfo;

public interface AirlineInfoService {
	
	AirlineInfo findByNameOfAirline(String nameOfAirline);
	AirlineInfo findByAirlineId(int airlineId);

}
