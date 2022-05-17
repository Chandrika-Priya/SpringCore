package com.ioc.inversionofControl.sports;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Baseball implements Coach {

    private Fortune fortune;

    @Value("${team}")
    private String team;

    public Baseball(@Qualifier("baseball") Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDetails() {
        System.out.println(fortune.getFortune());
        System.out.println(team);
        return "Base Ball ";
    }
}
