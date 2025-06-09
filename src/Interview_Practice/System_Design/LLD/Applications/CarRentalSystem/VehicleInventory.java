package Interview_Practice.System_Design.LLD.Applications.CarRentalSystem;

import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleStatus;
import Interview_Practice.System_Design.LLD.Applications.CarRentalSystem.Products.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleInventory {
    private List<Vehicle> vehicleList = new ArrayList();

    public List<Vehicle> searchVehicleFromList(VehicleType vehicleType){
        //perform search queries
        return vehicleList.stream()
                .filter(v -> v.getType() == type && v.getStatus() == VehicleStatus.Available)
                .collect(Collectors.toList());
    };

    //public abstract List<vehicle> searchVehicleFromList();

}
