package fr.polytech.gl.tp3;

/*
 * Case 12 : promotions.
 * Tâches :
 * - Corriger la complexité inutile de existingIsPromoDay().
 * - Implémenter applyPromo(amount, promoCode) :
 *      - si promoCode = "FREE" et amount >= 100 -> tout gratuit (0)
 *      - si promoCode = "HALF" -> moitié prix
 *      - sinon, pas de remise
 * - Écrire au moins un test unitaire pour applyPromo.
 */
public class Case12PromotionService {

  public boolean existingIsPromoDay(String day) {
    return "WEDNESDAY".equals(day) || "FRIDAY".equals(day);
  }

  public double applyPromo(double amount, String promoCode) {
    if ("FREE".equals(promoCode) && amount >= 100) {
      return 0;
    }
    if ("HALF".equals(promoCode)) {
      return amount / 2;
    }
    return amount;
  }
}
