package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, Integer>{
	
	Inventory findByInvId(int invId);

}
