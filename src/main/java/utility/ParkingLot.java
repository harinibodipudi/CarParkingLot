package utility;

import java.util.HashSet;

public class ParkingLot {
    public int capacity ;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    HashSet<Car> parkedVehicles = new HashSet<>();
    public void park(Car car){
        if(parkedVehicles.isEmpty()){
            new ParkingEmptyException();
        }else if(!parkedVehicles.contains(car)){
            parkedVehicles.add(car);
        }else if(parkedVehicles.contains(car)){
            new CarIsParkedAlready();
        }else{
            new ParkingFullException();
        }
    }
}