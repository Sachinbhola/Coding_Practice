package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;

public abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleColor;
    private String vehicleAge;
    private VehicleType vehicleType;
    private VehicleStatus vehicleStatus;

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle(String vehicleNumber, VehicleType vehicleType, VehicleStatus vehicleStatus, String vehicleAge){
        this.vehicleNumber = vehicleNumber;
        this.vehicleAge = vehicleAge;
        this.vehicleType = vehicleType;
        this.vehicleStatus = vehicleStatus;
    }
    //getters and setters
}
