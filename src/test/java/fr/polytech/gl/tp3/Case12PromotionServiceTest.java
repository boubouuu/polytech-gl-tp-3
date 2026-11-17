package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Case12PromotionServiceTest {

  private final Case12PromotionService service = new Case12PromotionService();

  @Test
  void testApplyPromoFreeAbove100() {
    assertEquals(0.0, service.applyPromo(120.0, "FREE"));
  }

  @Test
  void testApplyPromoFreeBelow100() {
    assertEquals(80.0, service.applyPromo(80.0, "FREE"));
  }

  @Test
  void testApplyPromoHalf() {
    assertEquals(60.0, service.applyPromo(120.0, "HALF"));
  }

  @Test
  void testApplyPromoNoDiscount() {
    assertEquals(50.0, service.applyPromo(50.0, "VIP"));
  }

  @Test
  void testIsPromoDay() {
    assertTrue(service.existingIsPromoDay("WEDNESDAY"));
    assertTrue(service.existingIsPromoDay("FRIDAY"));
    assertFalse(service.existingIsPromoDay("MONDAY"));
  }
}
