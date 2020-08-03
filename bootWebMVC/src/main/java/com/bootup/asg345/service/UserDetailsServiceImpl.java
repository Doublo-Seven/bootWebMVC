/**
 * 
 */
package com.bootup.asg345.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootup.asg345.dao.UserDetailsDao;
import com.bootup.asg345.entity.UserDetails;

/**
 * @author Dinesh
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userDao;
	
	@Override
	public UserDetails save(UserDetails user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public UserDetails findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.findByUserName(userName);
	}

	@Override
	public UserDetails findByPassword(String password) {
		// TODO Auto-generated method stub
		return userDao.findByPassword(password);
	}
	
	
	
	

}
