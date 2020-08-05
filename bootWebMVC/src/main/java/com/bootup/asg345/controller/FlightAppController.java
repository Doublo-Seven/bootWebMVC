package com.bootup.asg345.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	
	public String searchFlight(Model model) {
		List<Flight> flights= fs.findAll();
		model.addAttribute("flights", flights);
		return "searchFlight";
	}
	
	@RequestMapping(value = "/searchSpecific")
	public String searchSpecific(Model model, @ModelAttribute("flight") Flight flight) {
		List<Flight> flights1= fs.findByFlightDateAndOriginAndDestination(LocalDate.of(2020, 8, 21), flight.getOrigin(), flight.getDestination());
		model.addAttribute("flights1",flights1);
		return "searchSpecific";
	}
	
	@RequestMapping(value = "/book")
	public String book() {
		return "bookingScreen";
	}
}
