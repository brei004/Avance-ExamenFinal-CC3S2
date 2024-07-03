package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HumedadTest {

    @Test
    public void testHumedadAlta() {
        Humedad humedad = new Humedad(35);
        assertTrue(humedad.isFar(), "La humedad debe ser considerada alta.");
        assertFalse(humedad.isnotEnough(), "La humedad no debe ser considerada baja.");
    }

    @Test
    public void testHumedadBaja() {
        Humedad humedad = new Humedad(5);
        assertFalse(humedad.isFar(), "La humedad no debe ser considerada alta.");
        assertTrue(humedad.isnotEnough(), "La humedad debe ser considerada baja.");
    }

    @Test
    public void testHumedadNormal() {
        Humedad humedad = new Humedad(20);
        assertFalse(humedad.isFar(), "La humedad no debe ser considerada alta.");
        assertFalse(humedad.isnotEnough(), "La humedad no debe ser considerada baja.");
    }

}
