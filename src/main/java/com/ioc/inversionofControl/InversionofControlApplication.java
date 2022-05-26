package com.ioc.inversionofControl;

import com.ioc.inversionofControl.sports.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InversionofControlApplication {

    public static void main(String[] args) {
        //SpringApplication.run(InversionofControlApplication.class, args);
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
        Coach coach = applicationContext.getBean("baseball", Coach.class);
        //System.out.println(coach.getDetails());
        System.out.println(coach.getDetails());
        applicationContext.close();
    }

}
