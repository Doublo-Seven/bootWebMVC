package com.bootup.asg345.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.InventoryDao;
import com.bootup.asg345.entity.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryDao inventoryDao;
	@Override
	public Inventory findByInvId(int invId) {
		// TODO Auto-generated method stub
		return inventoryDao.findByInvId(invId);
	}

	
}
