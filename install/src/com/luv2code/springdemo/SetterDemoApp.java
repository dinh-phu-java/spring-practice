package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring contanier
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");

        //load the bean from spring container
        FootBallCoach theCoach=context.getBean("myFootBallCoach",FootBallCoach.class);

        System.out.println(theCoach.getDailyFortune()) ;

        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());

        context.close();
    }
}
