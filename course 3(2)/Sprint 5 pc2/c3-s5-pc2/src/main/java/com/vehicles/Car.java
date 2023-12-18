package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{
    Car(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName,vehicleModelName,vehicleType);
    }
    public int maxSpeed(String vehicleType){
        int speed=0;
        if(vehicleType=="sportsCar"){
            speed=250;
        }
        if (vehicleType == "cruiser") {
            speed=170;
        }
        return speed;
    }
    public String getManufacturerInformation(){
        return "Car {Manufacturer Name:"+getVehicleName()+", Model Name:"+getVehicleModelName()+",Type :"+getVehicleType();
    }

}
