package fr.polytech.gl.tp3;

public class Case11ServiceTest {
    public void Case11test()
    {
        Case11TaxService service = new Case11TaxService();
        System.out.println(service.existingVatLabel());
        if (service.computeVat(100, 20) == 20) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        try {
            service.computeVat(-100, 20);
            System.out.println("Test failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed");
        }
        try {
            service.computeVat(100, -20);
            System.out.println("Test failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed");
        }
    }
}