package com.ioc.inversionofControl.sports;

public class Baseball implements Coach {
    private Fortune fortune;

    public Baseball(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDetails() {
        System.out.println(fortune.getFortune());
        return "Base Ball ";
    }
}
