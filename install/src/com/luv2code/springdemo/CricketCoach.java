package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach(){

    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Cricket Coach: Setter injection : setCricketCoach!");
        this.fortuneService=fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach daily workout";
    }

    @Override
    public String getDailyFortune() {
       return this.fortuneService.getFortune();
    }
}
