package com.vehicles;

public class VehicleServices {
    public static void main(String args[]){
        Bike b=new Bike("bullet","S07","sportsBike");
        int bikeMaxSpeed=b.maxSpeed("sportsBike");
        System.out.println("Bike Maximum Speed "+bikeMaxSpeed);
        String s=b.getManufacturerInformation();
        System.out.println(s);
        Car c=new Car("BMW","S07","cruiser");
        int carMaxSpeed=c.maxSpeed("cruiser");
        System.out.println("Car Maximum Speed "+carMaxSpeed);
        String nm=c.getManufacturerInformation();
        System.out.println(nm);

    }
}
