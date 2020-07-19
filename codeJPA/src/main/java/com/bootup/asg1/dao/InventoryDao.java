package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, Integer>{

}
