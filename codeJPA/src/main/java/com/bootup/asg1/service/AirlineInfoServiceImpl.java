package com.bootup.asg1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootup.asg1.dao.AirlineInfoDao;
import com.bootup.asg1.entity.AirlineInfo;

public class AirlineInfoServiceImpl implements AirlineInfoService {
	
	@Autowired
	AirlineInfoDao airlineInfoDao;

	@Override
	public AirlineInfo findByNameOfAirline(String nameOfAirline) {
		// TODO Auto-generated method stub
		return airlineInfoDao.findByNameOfAirline(nameOfAirline);
	}

	@Override
	public AirlineInfo findByAirlineId(int airlineId) {
		// TODO Auto-generated method stub
		return airlineInfoDao.findByAirlineId(airlineId);
	}

}
