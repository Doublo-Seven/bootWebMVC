package com.bootup.asg345.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg345.entity.UserDetails;

public interface UserDetailsDao extends JpaRepository<UserDetails, Integer> {
	
	public UserDetails findByUserName(String userName);
	public UserDetails findByPassword(String password);

}
