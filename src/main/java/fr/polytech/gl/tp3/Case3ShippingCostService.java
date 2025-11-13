package fr.polytech.gl.tp3;

/*
 * Case 3 : coût de livraison.
 * Tâches :
 * - Corriger l'usage de magic numbers dans existingBaseCost().
 * - Implémenter computeShippingCost(weightKg, express) :
 *      - weightKg <= 0 -> IllegalArgumentException
 *      - base : 5€ + 1€ par kilo entamé
 *      - si express = true : supplément de 10€
 * - Écrire au moins un test unitaire pour computeShippingCost.
 */
public class Case3ShippingCostService {

    // ISSUE : magic numbers non documentés
    public double existingBaseCost() {
        return 5.0 + 1.0 * 3; // 3 kg "magique"
    }

    // FEATURE : à implémenter
    public double computeShippingCost(double weightKg, boolean express) {
        // TODO: implémenter la logique décrite dans JavaDoc
        return 0.0; // volontairement faux
    }
}
