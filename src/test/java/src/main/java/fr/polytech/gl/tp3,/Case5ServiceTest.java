// test unitaire du case 5
package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case5ServiceTest {

    @Test
    public void testToFahrenheit() {
        Case5TemperatureConverterService service = new Case5TemperatureConverterService();
        assertEquals(32.0, service.toFahrenheit(0), 0.001);
        assertEquals(212.0, service.toFahrenheit(100), 0.001);
        assertEquals(98.6, service.toFahrenheit(37), 0.001);
        assertEquals(-40.0, service.toFahrenheit(-40), 0.001);
        assertEquals(0.0, service.toFahrenheit(-17.7778), 0.001);
    }
}

