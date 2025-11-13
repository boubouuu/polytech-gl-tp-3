package fr.polytech.gl.tp3;

/*
 * Case 7 : statistiques simples.
 * Tâches :
 * - Corriger la boucle existingAverage() (bug sur division).
 * - Implémenter median(int[]) :
 *      - tableau non null, non vide
 *      - renvoyer la médiane (pour taille paire, moyenne des deux du milieu)
 * - Écrire au moins un test unitaire pour median.
 */
public class Case7StatisticsService {

    // ISSUE : bug dans le calcul de la moyenne
    public double existingAverage(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int v : values) {
            sum = v; // bug : on écrase au lieu de cumuler
        }
        return sum / values.length; // division entière
    }

    // FEATURE : à implémenter
    public double median(int[] values) {
        // TODO: implémenter la médiane correctement (pensez à copier/ trier)
        return 0; // volontairement faux
    }
}
