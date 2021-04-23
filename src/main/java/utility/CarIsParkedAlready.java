package utility;

public class CarIsParkedAlready extends Exception{

    public CarIsParkedAlready() {
        super("Car is parked already");
    }
}
