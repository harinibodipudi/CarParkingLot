package utility;

import org.junit.Before;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestParkingLot {
    static Car car;
    static ParkingLot parkingLot;

    @BeforeAll
    static void initializingObjects(){
        car = new Car();
        parkingLot = new ParkingLot(50);
    }

    @Test
    @Order(1)
    void testIfParkingLotIsFull() {
        Assertions.assertDoesNotThrow(() -> parkingLot.park(car));

    }

    @Test
    @Order(2)
    void testToParkTheCarInParkingLot() {
        Assertions.assertDoesNotThrow(()->parkingLot.park(car));
    }

    @Test
    @Order(3)
    void testToUnParkCarFromTheParkingLot(){
        Assertions.assertDoesNotThrow(()->parkingLot.unPark(car));
    }

}