package com.ioc.inversionofControl.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Baseball implements Coach {

    @Qualifier("happyFortune")
    @Autowired
    private Fortune fortune;

    @PostConstruct
    public void doInitialise(){
        System.out.println("initialising");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("destroying");
    }

    @Override
    public String getDetails() {
        System.out.println(fortune.getFortune());
        return "Base Ball ";
    }
}
