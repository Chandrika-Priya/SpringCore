package com.ioc.inversionofControl.sports;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

    @Override
    public String getFortune() {
        return "Happy Fortune";
    }
}
