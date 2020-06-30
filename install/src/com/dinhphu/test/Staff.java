package com.dinhphu.test;

public class Staff implements Employee{
    @Override
    public String dailyReport(){
        return "Staff daily report!";
    }
    @Override
    public String readReport(){
        return "";
    }
}
