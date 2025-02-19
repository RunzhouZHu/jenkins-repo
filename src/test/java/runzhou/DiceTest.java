package runzhou;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice dice = new Dice();

    @org.junit.jupiter.api.Test
    void testDiceRanges() {
        for (int i = 0; i < 100; i++) {
            dice.roll();
            assertFalse(dice.getDie1() > 6 || dice.getDie1() < 1);
            assertFalse(dice.getDie2() > 6 || dice.getDie2() < 1);
        }
    }

    @org.junit.jupiter.api.Test
    void testTimeBeforeDoubleIncrease() {
        for (int i = 0; i < 100; i++) {
            dice.roll();
            assertTrue(dice.timesBeforeDouble > 0);
        }
    }
}