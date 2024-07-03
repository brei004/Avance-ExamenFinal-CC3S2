package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LluviaTest {

    @Test
    public void testLluviaAlta() {
        Lluvia lluvia = new Lluvia(60);
        assertTrue(lluvia.isFar(), "La lluvia debe ser considerada alta.");
        assertFalse(lluvia.isnotEnough(), "La lluvia no debe ser considerada baja.");
    }

    @Test
    public void testLluviaBaja() {
        Lluvia lluvia = new Lluvia(5);
        assertFalse(lluvia.isFar(), "La lluvia no debe ser considerada alta.");
        assertTrue(lluvia.isnotEnough(), "La lluvia debe ser considerada baja.");
    }

    @Test
    public void testLluviaNormal() {
        Lluvia lluvia = new Lluvia(20);
        assertFalse(lluvia.isFar(), "La lluvia no debe ser considerada alta.");
        assertFalse(lluvia.isnotEnough(), "La lluvia no debe ser considerada baja.");
    }
}
