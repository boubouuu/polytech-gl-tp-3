package fr.polytech.gl.tp3;

/*
 * Case 14 : statut de commande.
 * Tâches :
 * - Corriger l'utilisation de constantes en dur dans existingStatusLabel().
 * - Implémenter nextStatus(current) :
 *      - "CREATED" -> "PAID"
 *      - "PAID" -> "SHIPPED"
 *      - "SHIPPED" -> "DELIVERED"
 *      - pour tout autre, IllegalArgumentException
 * - Écrire au moins un test unitaire pour nextStatus.
 */
public class Case14OrderStatusService {

    // ISSUE : valeurs de statut en dur, répétées
    public String existingStatusLabel(String status) {
        if ("CREATED".equals(status)) {
            return "Order created";
        }
        if ("CREATED".equals(status)) { // doublon
            return "Order just created";
        }
        if ("PAID".equals(status)) {
            return "Order paid";
        }
        return "Unknown";
    }

    // FEATURE : à implémenter
    public String nextStatus(String current) {
        // TODO: implémenter la transition de statut
        return "TODO"; // volontairement faux
    }
}
