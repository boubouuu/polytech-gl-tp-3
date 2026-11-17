package fr.polytech.gl.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Case14OrderStatusServiceTest {

    private final Case14OrderStatusService service = new Case14OrderStatusService();

    @Test
    void existingStatusLabelShouldReturnTheExpectedLabelForKnownStatuses() {
        assertEquals("Order created", service.existingStatusLabel("CREATED"));
        assertEquals("Order paid", service.existingStatusLabel("PAID"));
        assertEquals("Order shipped", service.existingStatusLabel("SHIPPED"));
        assertEquals("Order delivered", service.existingStatusLabel("DELIVERED"));
        assertEquals("Unknown", service.existingStatusLabel("UNKNOWN"));
    }

    @Test
    void nextStatusShouldAdvanceTheOrderLifecycle() {
        assertEquals("PAID", service.nextStatus("CREATED"));
        assertEquals("SHIPPED", service.nextStatus("PAID"));
        assertEquals("DELIVERED", service.nextStatus("SHIPPED"));
    }

    @Test
    void nextStatusShouldRejectUnsupportedStatuses() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.nextStatus("DELIVERED")
        );

        assertEquals("Unsupported order status: DELIVERED", exception.getMessage());
    }
}
