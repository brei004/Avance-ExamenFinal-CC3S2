package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class FakeNotificacionesUsuarios implements Evento {
    private String mensaje;
    private List<String> usuarios;

    public FakeNotificacionesUsuarios(String mensaje, List<String> usuarios) {
        this.mensaje = mensaje;
        this.usuarios = usuarios;
    }

    @Override
    public String getMensaje() {
        StringBuilder sb = new StringBuilder();
        sb.append("Simulación de envío de notificación a usuarios sobre ").append(mensaje).append(": ");
        for (String usuario : usuarios) {
            sb.append(usuario).append(", ");
        }
        return sb.toString();
    }

    public List<String> getUsuarios() {
        return usuarios;
    }
}
