package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

            ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach theCoach=context.getBean("myCoach",Coach.class);

            System.out.println(theCoach.getDailyWorkout());

            System.out.println(theCoach.getDailyFortune());

        context.close();
//        //load the spring configuration file
//        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//        //retrieve bean from spring container
//        Coach theCoach=context.getBean("myCoach2",Coach.class);
//        // call methods on the bean
//        System.out.println(theCoach.getDailyWorkout());
//        //close the context
//        context.close();
    }
}
