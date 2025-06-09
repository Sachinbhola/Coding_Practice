package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.VehicleFactoryClass;
import Interview_Practice.System_Design.LLD.Applications.HourlyPricingStratagy;

public class VehicleRentalSystem {

    public static void main(String[] args){
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.addVehicle(VehicleFactoryClass.createVehicle(VehicleType.CAR,"DL AB 7777",VehicleStatus.Available,"5"));
        User user = new User("U1", "Sachin");


        //get available car as per user queries
        //book vehicle
        Booking booking = new Booking(102,null,null,null,null);
        booking.setPricingStrategy(new HourlyPricingStratagy());
        String bookingPrice = booking.calculateTotalFare(2);
        //payment

    }
}
