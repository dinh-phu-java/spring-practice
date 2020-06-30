package com.dinhphu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee theEmployee=context.getBean("myEmployee",Employee.class);

        System.out.println(theEmployee.dailyReport());

        System.out.println(theEmployee.readReport());

        context.close();
    }
}
