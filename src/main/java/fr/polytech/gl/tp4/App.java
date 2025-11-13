package fr.polytech.gl.tp4;

public class App {

    private static final String BANNER = "WELCOME";

  public static void main(String[] args) {
    System.out.println("Welcome message : " + BANNER);
    }

    /** Renvoie une bannière (utile pour la Javadoc). */
    public String banner() {
        return BANNER;
    }
}
