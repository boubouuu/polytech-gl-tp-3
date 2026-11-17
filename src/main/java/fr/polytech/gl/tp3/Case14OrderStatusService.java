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

    private static final String CREATED = "CREATED";
    private static final String PAID = "PAID";
    private static final String SHIPPED = "SHIPPED";
    private static final String DELIVERED = "DELIVERED";

    public String existingStatusLabel(String status) {
        if (CREATED.equals(status)) {
            return "Order created";
        }
        if (PAID.equals(status)) {
            return "Order paid";
        }
        if (SHIPPED.equals(status)) {
            return "Order shipped";
        }
        if (DELIVERED.equals(status)) {
            return "Order delivered";
        }
        return "Unknown";
    }

    public String nextStatus(String current) {
        if (CREATED.equals(current)) {
            return PAID;
        }
        if (PAID.equals(current)) {
            return SHIPPED;
        }
        if (SHIPPED.equals(current)) {
            return DELIVERED;
        }
        throw new IllegalArgumentException("Unsupported order status: " + current);
    }
}
