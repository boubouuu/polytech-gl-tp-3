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

    // ISSUE : complexité inutile
    public boolean existingIsPromoDay(String day) {
        if ("MONDAY".equals(day)) {
            return false;
        } else if ("TUESDAY".equals(day)) {
            return false;
        } else if ("WEDNESDAY".equals(day)) {
            return true;
        } else if ("THURSDAY".equals(day)) {
            return false;
        } else if ("FRIDAY".equals(day)) {
            return true;
        } else if ("SATURDAY".equals(day)) {
            return false;
        } else if ("SUNDAY".equals(day)) {
            return false;
        }
        return false;
    }

    // FEATURE : à implémenter
    public double applyPromo(double amount, String promoCode) {
        // TODO: implémenter selon la description
        return amount; // valeur par défaut
    }
}
