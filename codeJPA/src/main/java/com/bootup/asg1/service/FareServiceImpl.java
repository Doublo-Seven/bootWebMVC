package com.bootup.asg1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootup.asg1.dao.FareDao;
import com.bootup.asg1.entity.Fare;

public class FareServiceImpl implements FareService {

	@Autowired
	FareDao fareDao;
	@Override
	public Fare findByFareId(int fareId) {
		// TODO Auto-generated method stub
		return fareDao.findByFareId(fareId);
	}

}
