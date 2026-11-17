package fr.polytech.gl.tp3;

import java.util.regex.Pattern;

/**
 * Service de validation simplifiée des adresses e-mail.
 */
public class Case13EmailValidatorService {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");

    public boolean existingLooksValid(String email) {
        return email != null
                && !email.isBlank()
                && EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean isCorporateEmail(String email) {
        return email != null
                && !email.isBlank()
                && email.endsWith("@company.com");
    }
}
