package fr.polytech.gl.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Case2LoyaltyPointsServiceTest {

  private Case2LoyaltyPointsService service;

  @BeforeEach
  void setUp() {
    service = new Case2LoyaltyPointsService();
  }

  @Test
  void testComputeEarnedPointsLessThan50() {
    assertEquals(10, service.computeEarnedPoints(0.0));
    assertEquals(10, service.computeEarnedPoints(49.99));
  }

  @Test
  void testComputeEarnedPointsBetween50And100() {
    assertEquals(20, service.computeEarnedPoints(50.0));
    assertEquals(20, service.computeEarnedPoints(99.99));
  }

  @Test
  void testComputeEarnedPointsGreaterThanOrEqualTo100() {
    assertEquals(50, service.computeEarnedPoints(100.0));
    assertEquals(50, service.computeEarnedPoints(250.0));
  }

  @Test
  void testComputeEarnedPointsNegativeAmountThrowsException() {
    assertThrows(IllegalArgumentException.class, () -> service.computeEarnedPoints(-1.0));
  }
}
