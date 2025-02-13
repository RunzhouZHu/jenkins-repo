package runzhou;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(37.77, converter.fahrenheitToCelsius(100), 0.01);

    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-273.15));
        assertTrue(converter.isExtremeTemperature(500));
        assertFalse(converter.isExtremeTemperature(36.5));
    }
}