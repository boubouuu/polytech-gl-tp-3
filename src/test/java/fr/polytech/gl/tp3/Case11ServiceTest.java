package fr.polytech.gl.tp3;
import org.junit.jupiter.api.Test;
public class Case11ServiceTest {
    private static final java.util.logging.Logger LOGGER =
            java.util.logging.Logger.getLogger(Case11ServiceTest.class.getName());
    @Test
    public void case11test()
    {
        Case11TaxService service = new Case11TaxService();
        if (service.computeVat(100, 20) == 20) {
            LOGGER.info("Test passed");
        } else {
            LOGGER.warning("Test failed");
        }
        try {
            service.computeVat(-100, 20);
            LOGGER.warning("Test failed");
        } catch (IllegalArgumentException e) {
            LOGGER.info("Test passed");
        }
        try {
            service.computeVat(100, -20);
            LOGGER.warning("Test failed");
        } catch (IllegalArgumentException e) {
            LOGGER.info("Test passed");
        }
    }
} 