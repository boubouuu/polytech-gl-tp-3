package fr.polytech.gl.tp3;

/*
 * Case 10 : réservation.
 * Tâches :
 * - Corriger la méthode existingIsOverlapping() (logique fausse).
 * - Implémenter canBook(currentBookings, newStart, newEnd) :
 *      - retourne false si un créneau chevauche [newStart, newEnd]
 *      - sinon true
 * - Les tests unitaires sont déjà fournis dans le dépôt
 */
public class Case10BookingService {

    // ISSUE : détection de chevauchement incorrecte
    public boolean existingIsOverlapping(int start1, int end1, int start2, int end2) {
        // Détection correcte du chevauchement
        return start1 < end2 && start2 < end1;
    }

    // FEATURE : implémentation correcte
    public boolean canBook(int[][] existingSlots, int newStart, int newEnd) {
        for (int[] slot : existingSlots) {
            if (existingIsOverlapping(slot[0], slot[1], newStart, newEnd)) {
                return false; // chevauchement trouvé
            }
        }
        return true; // aucun chevauchement
    }
}
