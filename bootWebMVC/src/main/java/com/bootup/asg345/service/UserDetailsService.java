package com.bootup.asg345.service;

import com.bootup.asg345.entity.UserDetails;

public interface UserDetailsService {

	public UserDetails save(UserDetails user);
	public UserDetails findByUserName(String userName);
	public UserDetails findByPassword(String password);
	
	
}
