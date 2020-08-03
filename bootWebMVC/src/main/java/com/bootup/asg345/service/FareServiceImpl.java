package com.bootup.asg345.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.FareDao;
import com.bootup.asg345.entity.Fare;

@Service
public class FareServiceImpl implements FareService {

	@Autowired
	FareDao fareDao;
	@Override
	public Fare findByFareId(int fareId) {
		// TODO Auto-generated method stub
		return fareDao.findByFareId(fareId);
	}

}
