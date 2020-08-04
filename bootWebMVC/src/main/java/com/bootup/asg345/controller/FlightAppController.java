package com.bootup.asg345.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootup.asg345.entity.Flight;
import com.bootup.asg345.entity.UserDetails;
import com.bootup.asg345.service.FlightService;
import com.bootup.asg345.service.UserDetailsService;

@Controller
public class FlightAppController {
	
	@Autowired
	UserDetailsService userService;
	
	@Autowired
	FlightService fs;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "login";
	}

	@RequestMapping(value = "/checkCred")
	public String signin(@ModelAttribute("user") UserDetails user ) {
		if(userService.findByUserName(user.getUserName()).equals("Dinesh") && userService.findByPassword(user.getPassword()).equals("12345678"))
			return "searchFlight";
		else
		return "error";
	}
	
	@RequestMapping(value = "/register")
	public String login() {
		return "register";
		
	}
	
	@RequestMapping(value = "/registerUser")
	public String signup(@ModelAttribute("user") UserDetails user)
	{
		userService.save(user);
		System.out.println("user added");
		return "login";
	}
	
	@RequestMapping(value = "/searchFlight")
	public String searchFlight(Model model, @ModelAttribute("flight")	Flight flight) {
		fs.findAll().forEach(flights->{
			System.out.println(flight.getFlightNumber() + " | " +
			   flights.getOrigin() + " | "+ 
			   flights.getDestination() + " | " + 
			   flights.getFlightDate() + " | " + 
			   flights.getFlightTime());
	System.out.println("-------------------------");
	});
		return "searchFlight";
	}
	
	@RequestMapping(value = "/searchSpecific")
	public String searchSpecific(@ModelAttribute("flight") Flight flight) {
		fs.findAllByFlightDateAndOriginAndDestination(flight.getFlightDate(), flight.getOrigin(), flight.getDestination()).forEach(flights->{
			System.out.println(flight.getFlightNumber() + " | " +
					   flights.getOrigin() + " | "+ 
					   flights.getDestination() + " | " + 
					   flights.getFlightDate() + " | " + 
					   flights.getFlightTime());
			System.out.println("-------------------------");	
		});
		return "searchSpecific";
	}
}
