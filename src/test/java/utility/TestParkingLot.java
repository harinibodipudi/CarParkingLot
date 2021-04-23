package utility;

import org.junit.Before;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestParkingLot {
    static Car car1;
    static Car car2;
    static Car car3;
    static ParkingLot parkingLot;

    @BeforeAll
    static void initializingObjects(){
        car1 = new Car();
        car2 = new Car();
        car3 = new Car();
        parkingLot = new ParkingLot(50);
    }

    @Test
    @Order(1)
    void testIfParkingLotIsFull() {
        Assertions.assertDoesNotThrow(() -> parkingLot.park(car1));

    }

    @Test
    @Order(2)
    void testToThrowExceptionIfCarIsAlreadyParked() {
        Assertions.assertThrows(CarIsParkedAlready.class,()->parkingLot.park(car1));
    }

    @Test
    @Order(3)
    void testToParkCarInParkingLot(){
        Assertions.assertDoesNotThrow(()->parkingLot.park(car2));
    }

    @Test
    @Order(4)
    void testToUnParkCarFromTheParkingLot(){
        Assertions.assertThrows(CarNotParkedHere.class,()->parkingLot.unPark(car3));
    }

    @Test
    @Order(5)
    void testToUnParkCarFromParkingLot(){
        Assertions.assertDoesNotThrow(()->parkingLot.unPark(car1));
    }

}