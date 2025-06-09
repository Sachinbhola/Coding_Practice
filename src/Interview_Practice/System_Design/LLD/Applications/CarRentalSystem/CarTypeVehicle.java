package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;

public class CarTypeVehicle extends Vehicle {

    public CarTypeVehicle(String vehicleNumber, VehicleType vehicleType, VehicleStatus vehicleStatus, String vehicleAge) {
        super(vehicleNumber, vehicleType, vehicleStatus, vehicleAge);
    }

    @Override
    public String setHourlyRate(String hourlyRate) {
        return "100";
    }
}
