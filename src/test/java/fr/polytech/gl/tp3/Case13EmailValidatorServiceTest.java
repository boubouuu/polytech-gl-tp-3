package fr.polytech.gl.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Case13EmailValidatorServiceTest {

    @Test
    void shouldValidateEmailAddresses() {
        Case13EmailValidatorService service = new Case13EmailValidatorService();

        assertAll(
                () -> assertTrue(service.existingLooksValid("test@example.com")),
                () -> assertFalse(service.existingLooksValid("invalid-email")),
                () -> assertTrue(service.isCorporateEmail("sacha@company.com")),
                () -> assertFalse(service.isCorporateEmail("sacha@gmail.com")),
                () -> assertFalse(service.isCorporateEmail(null)),
                () -> assertFalse(service.isCorporateEmail("   "))
        );
    }
}
