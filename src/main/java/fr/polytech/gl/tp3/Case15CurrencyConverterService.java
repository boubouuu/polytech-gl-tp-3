package fr.polytech.gl.tp3;

/*
 * Case 15 : conversion de devises.
 * Tâches :
 * - Corriger l'usage de taux codés en dur dans existingEuroToDollar().
 * - Implémenter convert(amount, rate) :
 *      - amount >= 0, rate > 0
 *      - retourne amount * rate
 * - Écrire au moins un test unitaire pour convert.
 */
public class Case15CurrencyConverterService {

    // ISSUE : taux codé en dur, sans paramètre

    private static final double EUR_TO_USD_RATE = 1.1234;

    public double existingEuroToDollar(double euros) {
        return euros * EUR_TO_USD_RATE; // taux arbitraire
    }

    // FEATURE : à implémenter
    public double convert(double amount, double rate) {

        if (amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }
        if (rate <= 0) {
            throw new IllegalArgumentException("rate must be > 0");
        }
        return amount * rate;

    }

}
