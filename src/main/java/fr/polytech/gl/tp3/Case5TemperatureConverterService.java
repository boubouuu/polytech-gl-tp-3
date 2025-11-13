package fr.polytech.gl.tp3;

/*
 * Case 5 : conversion de température.
 * Tâches :
 * - Corriger l'absurdité de existingToCelsius() (formule incorrecte).
 * - Implémenter toFahrenheit(celsius) correctement :
 *      - formule standard : F = C * 9/5 + 32
 * - Écrire au moins un test unitaire pour toFahrenheit.
 */
public class Case5TemperatureConverterService {

    // ISSUE : formule volontairement incorrecte
    public double existingToCelsius(double fahrenheit) {
        return fahrenheit + 273; // n'importe quoi
    }

    // FEATURE : à implémenter
    public double toFahrenheit(double celsius) {
        // TODO: implémenter la vraie formule
        return 0; // volontairement faux
    }
}
