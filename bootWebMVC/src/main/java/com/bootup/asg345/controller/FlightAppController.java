package com.bootup.asg345.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootup.asg345.entity.UserDetails;
import com.bootup.asg345.service.UserDetailsService;

@Controller
public class FlightAppController {
	
	@Autowired
	UserDetailsService userService;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}

	@RequestMapping(value = "/checkCred")
	public String signin(@ModelAttribute("user") UserDetails user ) {
		if(userService.findByUserName(user.getUserName()).equals("Dinesh") && userService.findByPassword(user.getPassword()).equals("12345678"))
			return "searchFlight";
		else
		return "error";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
		
	}
	
}
