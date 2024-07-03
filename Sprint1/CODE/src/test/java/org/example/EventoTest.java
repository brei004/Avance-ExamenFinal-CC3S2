package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EventoTest {

    @Test
    public void testAlertas() {
        Evento alerta = new Alertas("Lluvia Intensa");
        assertEquals("Alerta de Lluvia Intensa", alerta.getMensaje(), "El mensaje de alerta no coincide.");
    }

    @Test
    public void testAutomatico() {
        Evento automatico = new Automatico("Activar Sistema de Riego");
        assertEquals("Activar Sistema de Riego", automatico.getMensaje(), "El mensaje de acción automática no coincide.");
    }

    @Test
    public void testNotificaciones() {
        Evento notificacion = new Notificaciones("Temperatura Alta");
        assertEquals("Envio de notificación a usuarios sobre Temperatura Alta", notificacion.getMensaje(), "El mensaje de notificación no coincide.");
    }
}

