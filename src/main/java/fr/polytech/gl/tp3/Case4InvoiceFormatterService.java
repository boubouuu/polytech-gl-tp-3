package fr.polytech.gl.tp3;

/*
 * Case 4 : formatage de facture.
 * Tâches :
 * - Corriger la concaténation inefficace dans existingFormat().
 * - Implémenter formatInvoiceNumber(prefix, id) :
 *      - prefix non null/non blanc, id > 0
 *      - format : PREFIX-000ID (id sur 3 chiffres minimum, ex: 7 -> 007)
 * - Écrire au moins un test pour formatInvoiceNumber.
 */
public class Case4InvoiceFormatterService {

    // ISSUE : usage naïf de la concaténation dans une boucle
    public String existingFormat(String[] lines) {
        String result = "";
        if (lines == null) {
            return result;
        }
        for (String line : lines) {
            result = result + line + "\n";
        }
        return result;
    }

    // FEATURE : à implémenter
    public String formatInvoiceNumber(String prefix, int id) {
        // TODO: implémenter selon la description
        return "XXX"; // volontairement faux
    }
}
