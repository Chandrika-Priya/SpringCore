package com.ioc.inversionofControl.sports;

public class Cricket implements Coach{
    private Fortune fortune;
    private String team;

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDetails() {
        System.out.println(team);
        System.out.println(fortune.getFortune());
        return "cricket";
    }
}
