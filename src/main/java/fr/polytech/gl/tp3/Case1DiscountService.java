package fr.polytech.gl.tp3;

/*
 * Case 1 : gestion de remise.
 * Tâches :
 * - Corriger l'issue de duplication de littéraux dans existingDiscountLabel().
 * - Implémenter calculateDiscountedPrice(amount, rate) :
 *      - amount >= 0, rate entre 0 et 1.
 *      - retourne le prix après remise.
 * - Écrire au moins un test unitaire pour calculateDiscountedPrice.
 */
public class Case1DiscountService {

    private static final String DISCOUNT_PREFIX = "DISCOUNT";

    // ISSUE : duplication de littéraux ("DISCOUNT")
    public String existingDiscountLabel(String code) {
        if (code == null) {
            return DISCOUNT_PREFIX;
        }
        if (code.isBlank()) {
            return DISCOUNT_PREFIX;
        }
        return DISCOUNT_PREFIX + "-" + code;
    }

    // FEATURE : à implémenter
    public double calculateDiscountedPrice(double amount, double rate) {
        if (amount < 0 || rate < 0 || rate > 1) {
            throw new IllegalArgumentException("Amount must be non-negative and rate must be between 0 and 1");
        }
        return amount * (1 - rate);
    }
}
