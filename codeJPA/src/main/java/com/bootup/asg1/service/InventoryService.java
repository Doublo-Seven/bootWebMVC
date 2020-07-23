package com.bootup.asg1.service;

import com.bootup.asg1.entity.Inventory;

public interface InventoryService {
	
	Inventory findByInvId(int invId);

}
