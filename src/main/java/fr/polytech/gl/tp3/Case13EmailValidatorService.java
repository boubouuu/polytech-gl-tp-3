package fr.polytech.gl.tp3;

/*
 * Case 13 : validation d'e-mail (très simplifiée, pas réelle).
 * Tâches :
 * - Corriger la regex absurde de existingLooksValid().
 * - Implémenter isCorporateEmail(email) :
 *      - retourne true si l'adresse se termine par "@company.com"
 *      - gère les null / blancs
 * - Écrire au moins un test pour isCorporateEmail.
 */
import java.util.regex.Pattern;

public class Case13EmailValidatorService {

    // ISSUE : regex inutilement compliquée/erronée (exemple)
    private static final Pattern BAD_PATTERN =
            Pattern.compile(".*@.*\\..*.*.*"); // n'importe quoi

    public boolean existingLooksValid(String email) {
        return BAD_PATTERN.matcher(email).matches();
    }

    // FEATURE : à implémenter
    public boolean isCorporateEmail(String email) {
        // TODO: implémenter en se basant sur la fin de chaîne
        return false; // volontairement faux
    }
}
