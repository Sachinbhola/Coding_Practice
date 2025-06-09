package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Services;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Booking;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.User;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingManager {

    private List<Booking> bookingList = new ArrayList<>();
    private Integer booking_Id = 100;
    public Booking bookVehicle(User user, Vehicle vehicle, Date startDate, Date endDate){
        Integer bookingId = booking_Id+1;
        Booking booking = new Booking(bookingId,startDate,endDate,user,vehicle);
        return booking;
    }
}
