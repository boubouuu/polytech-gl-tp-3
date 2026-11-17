package fr.polytech.gl.tp3;

public class Case8PasswordStrengthService {

    public boolean existingIsDefaultPassword(String password) {
        return "password".equals(password);
    }

    public int score(String password) {
        if (password == null) {
            return 0;
        }

        int score = 0;
        boolean hasDigit = false;
        boolean hasUpper = false;

        if (password.length() >= 8) {
            score++;
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        if (hasDigit) {
            score++;
        }
        if (hasUpper) {
            score++;
        }

        return score;
    }
}