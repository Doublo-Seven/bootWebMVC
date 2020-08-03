package com.bootup.asg345.service;

import com.bootup.asg345.entity.AirlineInfo;

public interface AirlineInfoService {
	
	AirlineInfo findByNameOfAirline(String nameOfAirline);
	AirlineInfo findByAirlineId(int airlineId);

}
