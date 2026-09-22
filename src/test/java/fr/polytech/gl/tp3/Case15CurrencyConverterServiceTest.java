package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Case15CurrencyConverterServiceTest {

    @Test
    void convert_shouldReturnAmountTimesRate() {
        Case15CurrencyConverterService service = new Case15CurrencyConverterService();
        double result = service.convert(100, 1.1);
        assertEquals(110.0, result, 0.0001);
    }

    @Test
    void convert_shouldThrowWhenAmountNegative() {
        Case15CurrencyConverterService service = new Case15CurrencyConverterService();
        assertThrows(IllegalArgumentException.class, () -> service.convert(-10, 1.1));
    }

    @Test
    void convert_shouldThrowWhenRateZeroOrNegative() {
        Case15CurrencyConverterService service = new Case15CurrencyConverterService();
        assertThrows(IllegalArgumentException.class, () -> service.convert(100, 0));
    }
}