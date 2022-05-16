package com.ioc.inversionofControl.sports;

import org.springframework.stereotype.Component;

@Component
public class Baseball implements Coach {

    @Override
    public String getDetails() {
        return "Base Ball ";
    }
}
