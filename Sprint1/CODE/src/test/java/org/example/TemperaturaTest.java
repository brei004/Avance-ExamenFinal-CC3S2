package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {

    @Test
    public void testTemperaturaAlta() {
        Temperatura temperatura = new Temperatura(35);
        assertTrue(temperatura.isFar(), "La temperatura debe ser considerada alta.");
        assertFalse(temperatura.isnotEnough(), "La temperatura no debe ser considerada baja.");
    }

    @Test
    public void testTemperaturaBaja() {
        Temperatura temperatura = new Temperatura(-5);
        assertFalse(temperatura.isFar(), "La temperatura no debe ser considerada alta.");
        assertTrue(temperatura.isnotEnough(), "La temperatura debe ser considerada baja.");
    }

    @Test
    public void testTemperaturaNormal() {
        Temperatura temperatura = new Temperatura(20);
        assertFalse(temperatura.isFar(), "La temperatura no debe ser considerada alta.");
        assertFalse(temperatura.isnotEnough(), "La temperatura no debe ser considerada baja.");
    }
}

