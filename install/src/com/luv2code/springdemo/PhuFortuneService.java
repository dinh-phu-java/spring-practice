package com.luv2code.springdemo;

import java.util.ArrayList;

public class PhuFortuneService implements FortuneService{

    @Override
    public String getFortune() {

        String[] fortuneList=new String[]{"Java","Spring MVC","Angular"};

        int randomIndex= (int)Math.floor(Math.random()* (fortuneList.length-1)) ;

        return fortuneList[randomIndex];
    }
}
