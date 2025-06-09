package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.Payment;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.PricingStratagyInterface;

import java.util.Date;

public class Booking {
    private Integer bookingId;
    private Date bookingStartDate;
    private Date bookingEndDate;
    private User bookedByUser;
    private Vehicle bookedVehicle;
    private Payment paymentStatus;

    public Booking(Integer bookingId,Date bookingStartDate, Date bookingEndDate, User bookedByUser,Vehicle vehicle){
        this.bookingId = bookingId;
        this.bookedVehicle = vehicle;
        this.bookedByUser = bookedByUser;
        this.bookingStartDate = bookingStartDate;
        this.bookingEndDate = bookingEndDate;
        this.bookedVehicle.setVehicleStatus(VehicleStatus.Booked);

    }

    private PricingStratagyInterface pricingStrategy;

    public void setPricingStrategy(PricingStratagyInterface strategy) {
        this.pricingStrategy = strategy;
    }

    public String calculateTotalFare(Integer durationInHours) {
        return pricingStrategy.calcualtePrice(durationInHours);
    }
}
