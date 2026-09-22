package fr.polytech.gl.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Case3ShippingCostServiceTest {

    private Case3ShippingCostService shippingCostService;

    @BeforeEach
    void setUp() {
        shippingCostService = new Case3ShippingCostService();
    }

    @Test
    void testComputeShippingCost_InvalidWeight_ThrowsException() {
        // Poids négatif ou nul doit lever une IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            shippingCostService.computeShippingCost(0, false);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            shippingCostService.computeShippingCost(-2.5, true);
        });
    }

    @Test
    void testComputeShippingCost_StandardDelivery() {
        // Règle : 5€ de base + 1€ par kilo
        // Pour 3 kg : 5 + (1 * 3) = 8.0
        assertEquals(8.0, shippingCostService.computeShippingCost(3.0, false));
    }

    @Test
    void testComputeShippingCost_ExpressDelivery() {
        // Règle : 5€ de base + 1€ par kilo + 10€ de supplément express
        // Pour 2 kg en express : 5 + (1 * 2) + 10 = 17.0
        assertEquals(17.0, shippingCostService.computeShippingCost(2.0, true));
    }
}