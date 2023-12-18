package com.vehicles;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;
    //default constructor
    VehicleManufacturer(){

    }
    //parameterized constructor
    VehicleManufacturer(String vehicleName,String vehicleModelName,String vehicleType){
        this.vehicleName=vehicleName;
        this.vehicleModelName=vehicleModelName;
        this.vehicleType=vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public abstract String getManufacturerInformation();
}
