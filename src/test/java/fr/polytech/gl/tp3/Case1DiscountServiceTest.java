package fr.polytech.gl.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Case1DiscountServiceTest {

    private final Case1DiscountService service = new Case1DiscountService();

    @Test
    void shouldCalculateDiscountedPrice() {
        assertEquals(80.0, service.calculateDiscountedPrice(100.0, 0.2));
    }

    @Test
    void shouldAcceptNoDiscountAndFullDiscount() {
        assertEquals(100.0, service.calculateDiscountedPrice(100.0, 0.0));
        assertEquals(0.0, service.calculateDiscountedPrice(100.0, 1.0));
    }

    @Test
    void shouldRejectNegativeAmount() {
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateDiscountedPrice(-1.0, 0.2));
    }

    @Test
    void shouldRejectRateOutsideAllowedRange() {
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateDiscountedPrice(100.0, -0.1));
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateDiscountedPrice(100.0, 1.1));
    }

    @Test
    void shouldBuildDiscountLabel() {
        assertEquals("DISCOUNT", service.existingDiscountLabel(null));
        assertEquals("DISCOUNT", service.existingDiscountLabel("   "));
        assertEquals("DISCOUNT-SUMMER", service.existingDiscountLabel("SUMMER"));
    }
}
