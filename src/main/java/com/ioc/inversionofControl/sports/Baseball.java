package com.ioc.inversionofControl.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baseball implements Coach {

    @Qualifier("happyFortune")
    @Autowired
    private Fortune fortune;

    @Override
    public String getDetails() {
        System.out.println(fortune.getFortune());
        return "Base Ball ";
    }
}
