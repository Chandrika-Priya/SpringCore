package com.ioc.inversionofControl;

import com.ioc.inversionofControl.sports.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InversionofControlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(InversionofControlApplication.class, args);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = applicationContext.getBean("myCoach",Coach.class);
		System.out.println(coach.getDetails());
		applicationContext.close();
	}

}
