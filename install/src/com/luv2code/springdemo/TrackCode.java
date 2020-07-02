package com.luv2code.springdemo;

public class TrackCode implements Coach {

    private FortuneService fortuneService;

    public TrackCode(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
       return "Just do it: "+ fortuneService.getFortune();
    }

}
