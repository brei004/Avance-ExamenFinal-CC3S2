package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PresionTest {

    @Test
    public void testPresionAlta() {
        Presion presion = new Presion(1300);
        assertTrue(presion.isFar(), "La Presion debe ser considerada alta.");
        assertFalse(presion.isnotEnough(), "La Presion no debe ser considerada baja.");
    }

    @Test
    public void testPresionBaja() {
        Presion presion = new Presion(300);
        assertFalse(presion.isFar(), "La Presion no debe ser considerada alta.");
        assertTrue(presion.isnotEnough(), "La Presion debe ser considerada baja.");
    }

    @Test
    public void testPresionNormal() {
        Presion presion = new Presion(1000);
        assertFalse(presion.isFar(), "La Presion no debe ser considerada alta.");
        assertFalse(presion.isnotEnough(), "La Presion no debe ser considerada baja.");
    }
}
