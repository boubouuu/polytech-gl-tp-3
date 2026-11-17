package fr.polytech.gl.tp3;

/* Enzo
 * Case 10 : réservation.
 * Tâches :
 * - Corriger la méthode existingIsOverlapping() (logique fausse).
 * - Implémenter canBook(currentBookings, newStart, newEnd) :
 *      - retourne false si un créneau chevauche [newStart, newEnd]
 *      - sinon true
 * - Écrire au moins un test unitaire pour canBook.
 */
public class Case10BookingService {

    // ISSUE : détection de chevauchement incorrecte
    public boolean existingIsOverlapping(int start1, int end1, int start2, int end2) {
        return start1 < end2 && start2 < end1;
    }

    // FEATURE : à implémenter
    public boolean canBook(int[][] existingSlots, int newStart, int newEnd) {
        for (int[] slot : existingSlots) {
            if (existingIsOverlapping(slot[0], slot[1], newStart, newEnd)) {
                return false;
            }
        }
        return true;
    }
}
