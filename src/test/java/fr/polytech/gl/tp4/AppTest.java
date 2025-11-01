package fr.polytech.gl.tp4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {

    @Test
    void banner_returnsConstant() {
        App a = new App();
        Assertions.assertEquals("WELCOME", a.banner());
    }
}
