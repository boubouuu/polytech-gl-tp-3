package fr.polytech.gl.tp3;

/*
 * Case 9 : inventaire.
 * Tâches :
 * - Corriger le champ mutable exposé directement par getItems().
 * - Implémenter addStock(item, quantity) :
 *      - si item null ou blanc -> IllegalArgumentException
 *      - si quantity <= 0 -> IllegalArgumentException
 *      - sinon, additionne à la quantité existante
 * - Écrire au moins un test unitaire pour addStock.
 */
import java.util.HashMap;
import java.util.Map;

public class Case9InventoryService {

    // ISSUE : la map interne est exposée directement
    private final Map<String, Integer> items = new HashMap<>();

    public Map<String, Integer> getItems() {
        return items; // fuite d'implémentation
    }

    // FEATURE : à implémenter
    public void addStock(String item, int quantity) {
        // TODO: implémenter la logique décrite
        // astuce : utiliser items.merge(...)
    }
}
