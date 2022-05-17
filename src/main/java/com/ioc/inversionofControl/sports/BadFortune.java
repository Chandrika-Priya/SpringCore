package com.ioc.inversionofControl.sports;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune {
    @Override
    public String getFortune() {
        return "Bad Fortune";
    }
}
