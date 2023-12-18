package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    Bike(String vehicleName,String vehicleModelName,String vehicleType){
        super(vehicleName,vehicleModelName,vehicleType);
    }
    public int maxSpeed(String vehicleType){
        int speed=0;
        if(vehicleType=="sportsBike"){
            speed=300;
        }
        if (vehicleType == "cruiser") {
            speed=170;
        }
        return speed;
    }
    public String getManufacturerInformation(){
        return "Bike {Manufacturer Name:"+getVehicleName()+", Model Name:"+getVehicleModelName()+",Type :"+getVehicleType();
    }

}
