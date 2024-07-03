package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class FakeNotificacionesUsuariosTest {

    @Test
    public void testGetMensaje() {
        String mensaje = "Alerta de Lluvia";
        List<String> usuarios = Arrays.asList("Usuario1", "Usuario2", "Usuario3");
        FakeNotificacionesUsuarios fakeNotificaciones = new FakeNotificacionesUsuarios(mensaje, usuarios);

        String mensajeSimulado = fakeNotificaciones.getMensaje();

        assertTrue(mensajeSimulado.contains("Simulación de envío de notificación a usuarios sobre " + mensaje));
        for (String usuario : usuarios) {
            assertTrue(mensajeSimulado.contains(usuario));
        }
    }
}

