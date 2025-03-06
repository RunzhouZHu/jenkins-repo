import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void calculateTripCost() {
        assertEquals(10.0, TripCostCalculator.calculateTripCost(100, 2, 5));
    }

}