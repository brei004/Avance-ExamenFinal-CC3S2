package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VientoTest {

    @Test
    public void testVientoAlta() {
        Viento viento = new Viento(80);
        assertTrue(viento.isFar(), "El viento debe ser considerada alta.");
        assertFalse(viento.isnotEnough(), "La humedad no debe ser considerada baja.");
    }

    @Test
    public void testVientoBaja() {
        Viento viento = new Viento(5);
        assertFalse(viento.isFar(), "El viento no debe ser considerada alta.");
        assertTrue(viento.isnotEnough(), "El viento debe ser considerada baja.");
    }

    @Test
    public void testVientoNormal() {
        Viento viento = new Viento(20);
        assertFalse(viento.isFar(), "El viento no debe ser considerada alta.");
        assertFalse(viento.isnotEnough(), "El viento no debe ser considerada baja.");
    }
}
