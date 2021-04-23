package utility;

import java.util.HashSet;

public class ParkingLot {
    public int capacity ;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    HashSet<Car> parkedVehicles = new HashSet<>();
    public void park(Car car) throws CarIsParkedAlready, ParkingFullException {
        if(!parkedVehicles.contains(car)){
            parkedVehicles.add(car);
        }else if(parkedVehicles.contains(car)){
            throw new CarIsParkedAlready();
        }else{
            throw new ParkingFullException();
        }
    }

    public void unPark(Car car) throws CarNotParkedHere {
        if(!parkedVehicles.contains(car)){
            throw new CarNotParkedHere();
        }else{
            parkedVehicles.remove(car);
        }
    }
}