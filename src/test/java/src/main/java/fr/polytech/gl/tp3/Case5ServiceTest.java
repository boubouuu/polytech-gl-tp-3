package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Case5ServiceTest {

    @Test
    void testToFahrenheit() {
        Case5TemperatureConverterService service = new Case5TemperatureConverterService();
        assertEquals(32.0, service.toFahrenheit(0), 0.001);
        assertEquals(212.0, service.toFahrenheit(100), 0.001);
        assertEquals(98.6, service.toFahrenheit(37), 0.001);
        assertEquals(-40.0, service.toFahrenheit(-40), 0.001);
        assertEquals(0.0, service.toFahrenheit(-17.7778), 0.001);
    }

    @Test
    void testExistingToCelsius() {
        Case5TemperatureConverterService service = new Case5TemperatureConverterService();
        assertEquals(0.0, service.existingToCelsius(32.0), 0.001);
        assertEquals(100.0, service.existingToCelsius(212.0), 0.001);
        assertEquals(-40.0, service.existingToCelsius(-40.0), 0.001);
    }
}