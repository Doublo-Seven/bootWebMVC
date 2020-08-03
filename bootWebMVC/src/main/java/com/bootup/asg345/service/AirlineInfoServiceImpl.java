package com.bootup.asg345.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.AirlineInfoDao;
import com.bootup.asg345.entity.AirlineInfo;

@Service
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
