package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;

public class VehicleRentalSystem {

    public static void main(String[] args){
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.addVehicle(new Vehicle("DL AB 7777", VehicleType.CAR, VehicleStatus.Available,"5"));
        User user = new User("U1", "Sachin");

        //get available car as per user queries
        //book vehicle
        //payment

    }
}
