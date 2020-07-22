package com.bootup.asg1;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootup.asg1.service.FlightService;

@SpringBootApplication
public class CodeJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CodeJpaApplication.class, args);
		FlightService fs = ac.getBean(FlightService.class);
		
		System.out.println("\n1. All Indigo flights on 21st August, 2020 ");
		fs.findAllByFlightNumberAndFlightDate("6E%", LocalDate.of(2020, 8, 21)).forEach(flight->{
			System.out.println(flight.getFlightNumber() + " | " +
							   flight.getOrigin() + " | "+ 
							   flight.getDestination() + " | " + 
							   flight.getFlightDate() + " | " + 
							   flight.getFlightDate() + " | " + 
							   flight.getFlightTime());
			System.out.println("-------------------------");
		});
			
		System.out.println("\n2. All flights from Delhi on 21st August,2020 ");
		fs.findAllByOriginAndFlightDate("DELHI", LocalDate.of(2020, 8, 21)).forEach(flight->{
			System.out.println(flight.getFlightNumber() + " | " +
					   flight.getOrigin() + " | "+ 
					   flight.getDestination() + " | " + 
					   flight.getFlightDate() + " | " + 
					   flight.getFlightDate() + " | " + 
					   flight.getFlightTime());
			System.out.println("-------------------------");
		});
		
		
		}
		
	}

