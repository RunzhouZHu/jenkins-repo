package runzhou;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void sum() {
        Cal cal = new Cal();
        assertEquals(2, cal.sum(1, 1));
    }

    @Test
    void sub() {
        Cal cal = new Cal();
        assertEquals(0, cal.sub(1, 1));
    }

    @Test
    void mul() {
        Cal cal = new Cal();
        assertEquals(1, cal.mul(1, 1));
    }

    @Test
    void div() {
        Cal cal = new Cal();
        assertEquals(1, cal.div(1, 1));
    }
}