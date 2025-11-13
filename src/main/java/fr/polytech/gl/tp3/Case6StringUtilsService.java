package fr.polytech.gl.tp3;

/*
 * Case 6 : utilitaires sur les chaînes.
 * Tâches :
 * - Corriger le problème de NPE potentiel dans safeTrim().
 * - Implémenter isPalindrome(word) :
 *      - ignore la casse et les espaces
 *      - "Kayak" -> true ; "test" -> false
 * - Écrire au moins un test unitaire pour isPalindrome.
 */
public class Case6StringUtilsService {

    // ISSUE : possible NullPointerException
    public String safeTrim(String input) {
        return input.trim(); // si input est null -> NPE
    }

    // FEATURE : à implémenter
    public boolean isPalindrome(String word) {
        // TODO: implémenter en étant robuste à null/vides
        return false; // volontairement faux
    }
}
