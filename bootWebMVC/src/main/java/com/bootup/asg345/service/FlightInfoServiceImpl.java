package com.bootup.asg345.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.FightInfoDao;
import com.bootup.asg345.entity.FlightInfo;

@Service
public class FlightInfoServiceImpl implements FlightInfoService {

	@Autowired
	FightInfoDao flightInfoDao;
	
	@Override
	public FlightInfo findByFlightNumber(String flightNumber) {
		
		return flightInfoDao.findByFlightNumber(flightNumber);
	}

	@Override
	public FlightInfo findByFlightInfoid(int flightinfoId) {
		// TODO Auto-generated method stub
		return flightInfoDao.findByFlightInfoid(flightinfoId) ;
	}

}
