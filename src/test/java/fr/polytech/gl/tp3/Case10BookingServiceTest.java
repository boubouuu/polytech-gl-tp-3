package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Case10BookingServiceTest {

    @Test
    void shouldRejectOverlappingBooking() {
        Case10BookingService bookingService = new Case10BookingService();
        int[][] existingSlots = {
                {10, 12},
                {14, 16}
        };

        assertFalse(bookingService.canBook(existingSlots, 11, 13));
    }

    @Test
    void shouldAcceptNonOverlappingBooking() {
        Case10BookingService bookingService = new Case10BookingService();
        int[][] existingSlots = {
                {10, 12},
                {14, 16}
        };

        assertTrue(bookingService.canBook(existingSlots, 12, 14));
        
    }
}



