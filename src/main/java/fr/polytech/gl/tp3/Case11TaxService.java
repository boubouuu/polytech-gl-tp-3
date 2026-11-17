package fr.polytech.gl.tp3;

/*
 * Case 11 : calcul de TVA.
 * Tâches :
 * - Corriger l'issue de paramètre inutile dans existingVatLabel().
 * - Implémenter computeVat(amount, rate) :
 *      - amount >= 0, rate >= 0
 *      - retourne le montant de TVA
 * - Écrire au moins un test unitaire sur computeVat.
 */
public class Case11TaxService {

    // ISSUE : paramètre jamais utilisé
    public String existingVatLabel() {
        return "TVA standard";
    }

    // FEATURE : à implémenter
    public double computeVat(double amount, double rate) {
        // TODO: implémenter en gérant les entrées invalides
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount et rate doivent être non-négatifs");
        }
        return amount * rate / 100;
    }

    
}
