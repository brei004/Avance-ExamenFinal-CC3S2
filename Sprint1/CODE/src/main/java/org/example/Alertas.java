package org.example;

public class Alertas implements Evento{
    private final String accion;

    public Alertas(String mensaje){
        this.accion=mensaje;
    }
    @Override
    public String getMensaje() {
        return "Alerta de "+accion;
    }
}
