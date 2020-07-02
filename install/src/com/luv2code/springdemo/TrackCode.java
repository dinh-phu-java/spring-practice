package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCode implements Coach, DisposableBean {

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

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff!");
    }
    //with prototype scope
    @Override
    public void destroy() throws Exception {
        //do some destroy things;
    }
}
