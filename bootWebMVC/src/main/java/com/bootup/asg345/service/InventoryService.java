package com.bootup.asg345.service;

import com.bootup.asg345.entity.Inventory;

public interface InventoryService {
	
	Inventory findByInvId(int invId);

}
