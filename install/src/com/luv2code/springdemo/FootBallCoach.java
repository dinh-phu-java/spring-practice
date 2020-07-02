package com.luv2code.springdemo;

public class FootBallCoach implements Coach{
    private FortuneService fortuneService;

    private String email;
    private String team;

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
