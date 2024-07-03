package org.example;

public class Notificaciones implements Evento{

    private final String accion;
    public Notificaciones(String mensaje){
        this.accion= mensaje;

    }
    @Override
    public String getMensaje() {
        return "Envio de notificación a usuarios sobre "+accion;
    }
}
