package fr.polytech.gl.tp3;

/*
 * Case 2 : gestion de points de fidélité.
 * Tâches :
 * - Corriger l'issue de code mort dans existingLevelName().
 * - Implémenter computeEarnedPoints(orderAmount) :
 *      - si orderAmount < 0 -> IllegalArgumentException
 *      - sinon :
 *          - < 50 : 10 points
 *          - [50, 100[ : 20 points
 *          - >= 100 : 50 points
 * - Écrire au moins un test unitaire sur computeEarnedPoints.
 */
public class Case2LoyaltyPointsService {

    // ISSUE : code mort / branche inatteignable
    public String existingLevelName(int points) {
        if (points < 0) {
            return "ERROR";
        }
        if (points < 100) {
            return "BRONZE";
        } else if (points < 200) {
            return "SILVER";
        } else if (points >= 200) {
            return "GOLD";
        } else {
            return "UNUSED"; // branche inatteignable
        }
    }

    // FEATURE : à implémenter
    public int computeEarnedPoints(double orderAmount) {
        // TODO: implémenter la logique décrite dans le commentaire ci-dessus
        return -1; // volontairement faux
    }
}
