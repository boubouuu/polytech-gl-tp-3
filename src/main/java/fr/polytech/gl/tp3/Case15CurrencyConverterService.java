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
    public double existingEuroToDollar(double euros) {
        return euros * 1.1234; // taux arbitraire
    }

    // FEATURE : à implémenter
    public double convert(double amount, double rate) {
        // TODO: implémenter en validant les entrées
        return 0; // volontairement faux
    }
}
