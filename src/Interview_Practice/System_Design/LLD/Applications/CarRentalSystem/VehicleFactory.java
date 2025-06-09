package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;

import static Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType.BIKE;
import static Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType.CAR;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type, String vehicleNumber, VehicleStatus status,String age){
        if (type == CAR) return new CarTypeVehicle(vehicleNumber,CAR,status,age);
        else if(type == BIKE) return new BikeTypeVehicle(vehicleNumber,BIKE,status,age);
        // Add more types as needed
        else throw new IllegalArgumentException("Invalid vehicle type");
    }
}
