package fr.polytech.gl.tp3;

/*
 * Case 8 : évaluation de mot de passe.
 * Tâches :
 * - Corriger la comparaison de chaînes dans existingIsDefaultPassword().
 * - Implémenter score(password) :
 *      - +1 si longueur >= 8
 *      - +1 si contient un chiffre
 *      - +1 si contient une majuscule
 *      - retourne un score entre 0 et 3
 * - Écrire au moins un test unitaire pour score.
 */
public class Case8PasswordStrengthService {

    // ISSUE : comparaison de chaînes avec ==
    public boolean existingIsDefaultPassword(String password) {
        return password == "password"; // mauvaise pratique
    }

    // FEATURE : à implémenter
    public int score(String password) {
        // TODO: implémenter la logique de scoring
        return -1; // volontairement faux
    }
}
