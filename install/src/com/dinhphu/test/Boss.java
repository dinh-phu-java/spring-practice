package com.dinhphu.test;

public class Boss implements Employee{

    private IReader iReader;

    public Boss(IReader iReader){
        this.iReader=iReader;
    }

    @Override
    public String dailyReport(){
        return "Daily report of Boss!";
    }
    @Override
    public String readReport(){
        return iReader.read();
    }
}
