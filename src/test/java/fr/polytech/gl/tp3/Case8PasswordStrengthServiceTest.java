package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Case8PasswordStrengthServiceTest {

    private final Case8PasswordStrengthService service = new Case8PasswordStrengthService();

    @Test
    void testExistingIsDefaultPassword() {
        assertTrue(service.existingIsDefaultPassword("password"));
        assertFalse(service.existingIsDefaultPassword("autre"));
        assertFalse(service.existingIsDefaultPassword(null));
    }

    @Test
    void testScore() {
        // Score 0
        assertEquals(0, service.score(null));
        assertEquals(0, service.score("court"));

        // Score 1
        assertEquals(1, service.score("longlonglong")); // longueur >= 8
        assertEquals(1, service.score("court1"));       // 1 chiffre
        assertEquals(1, service.score("Court"));        // 1 majuscule

        // Score 2
        assertEquals(2, service.score("Longlong"));     // longueur >= 8 + majuscule
        assertEquals(2, service.score("longlong1"));    // longueur >= 8 + chiffre
        assertEquals(2, service.score("Court1"));       // majuscule + chiffre (< 8)

        // Score 3
        assertEquals(3, service.score("Longlong1"));    // longueur >= 8 + majuscule + chiffre
    }
}