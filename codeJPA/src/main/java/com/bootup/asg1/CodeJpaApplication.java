package com.bootup.asg1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootup.asg1.entity.Flight;
import com.bootup.asg1.service.AirlineInfoService;
import com.bootup.asg1.service.FareService;
import com.bootup.asg1.service.FlightInfoService;
import com.bootup.asg1.service.FlightService;
import com.bootup.asg1.service.InventoryService;

@SpringBootApplication
public class CodeJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CodeJpaApplication.class, args);
		FlightService fs = ac.getBean(FlightService.class);
		FlightInfoService fis = ac.getBean(FlightInfoService.class);
		FareService fservice = ac.getBean(FareService.class);
		AirlineInfoService als = ac.getBean(AirlineInfoService.class);
		InventoryService ivs = ac.getBean(InventoryService.class);
		
		
//		System.out.println("\n1. All Indigo flights on 21st August, 2020 ");
//		fs.findAllByFlightNumberAndFlightDate("6E%", LocalDate.of(2020, 8, 21)).forEach(flight->{
//			System.out.println(flight.getFlightNumber() + " | " +
//							   flight.getOrigin() + " | "+ 
//							   flight.getDestination() + " | " + 
//							   flight.getFlightDate() + " | " + 
//							   flight.getFlightDate() + " | " + 
//							   flight.getFlightTime());
//			System.out.println("-------------------------");
//		});
//			
//		System.out.println("\n2. All flights from Delhi on 21st August,2020 ");
//		fs.findAllByOriginAndFlightDate("DELHI", LocalDate.of(2020, 8, 21)).forEach(flight->{
//			System.out.println(flight.getFlightNumber() + " | " +
//					   flight.getOrigin() + " | "+ 
//					   flight.getDestination() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightTime());
//			System.out.println("-------------------------");
//		});
//		
//		System.out.println("\n3. Search for flights flying between Delhi to Chennai on 21st August,2020 by flight fare low to high");
//		fs.findByOriginAndDestinationAndFlightDate("DELHI", "CHENNAI", LocalDate.of(2020, 8, 21)).forEach(flight->{
//			System.out.println(flight.getFlightNumber() + " | " +
//					   flight.getOrigin() + " | "+ 
//					   flight.getDestination() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightTime());
//			System.out.println("-------------------------");		   
//		});
//		
//		System.out.println("\n4. Search flights based on flight number, orgin and destination");
//		fs.findByFlightNumberAndOriginAndDestination("AI-850", "DELHI", "HYDERABAD").forEach(flight->{
//			System.out.println(flight.getFlightNumber() + " | " +
//					   flight.getOrigin() + " | "+ 
//					   flight.getDestination() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightTime());
//			System.out.println("-------------------------");		   
//		});
//		
//		System.out.println("\n5. Search flights based on flight number, flight date and flight time");
//		fs.findByFlightNumberAndFlightDateAndFlightTime("AI-840", LocalDate.of(2020, 8, 21), LocalTime.of(2, 12, 0)).forEach(flight->{
//			System.out.println(flight.getFlightNumber() + " | " +
//					   flight.getOrigin() + " | "+ 
//					   flight.getDestination() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightDate() + " | " + 
//					   flight.getFlightTime());
//			System.out.println("-------------------------");		   
//		});
		
		System.out.println("\n6. add additional flight from pune to chennai");
//		remove below commented lines if executing for the first time
//		Flight f1 = new Flight("CHENNAI","2 hrs 15 mins",LocalDate.of(2020, 8, 22),fis.findByFlightNumber("AI-850").getFlightNumber(),"PUNE",LocalTime.of(8, 15, 0),fservice.findByFareId(40),fis.findByFlightInfoid(3),ivs.findByInvId(38));	
//		System.out.println(fs.save(f1).getId());
//		Flight f2 = new Flight("CHENNAI","2 hrs 30 mins",LocalDate.of(2020, 8, 22),fis.findByFlightNumber("AI-840").getFlightNumber(),"PUNE",LocalTime.of(12, 50, 0),fservice.findByFareId(40),fis.findByFlightInfoid(2),ivs.findByInvId(38));
//		System.out.println(fs.save(f2).getId());
		}
		
	}

