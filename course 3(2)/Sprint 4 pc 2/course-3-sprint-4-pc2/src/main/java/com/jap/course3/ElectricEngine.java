package com.jap.course3;

public class ElectricEngine extends Engine{
    int voltage;
    public ElectricEngine(String modelNo,String displacement,int maxPower,int maxRpm,int noOfCylinders,int voltage){
        super(modelNo,displacement,maxPower,maxRpm,noOfCylinders);
        this.voltage=voltage;
    }
}
