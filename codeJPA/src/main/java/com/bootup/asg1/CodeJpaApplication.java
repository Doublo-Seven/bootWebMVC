package com.bootup.asg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootup.asg1.dao.AirlineInfoDao;
import com.bootup.asg1.entity.AirlineInfo;
import com.bootup.asg1.entity.FlightInfo;

@SpringBootApplication
public class CodeJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CodeJpaApplication.class, args);
		AirlineInfoDao ai = ac.getBean(AirlineInfoDao.class);
		
		AirlineInfo ai1 = new AirlineInfo("airindia.png","Air India");
		FlightInfo fi1 = new FlightInfo("AI-840", "Air Bus", 150);
		
		ai1.getFlightInfoList().add(fi1);
		ai.save(ai1);
	}

}
