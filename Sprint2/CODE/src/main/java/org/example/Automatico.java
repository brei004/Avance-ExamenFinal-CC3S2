package org.example;

public class Automatico implements Evento{
    private final String accion;

    public Automatico(String mensaje){
        this.accion=mensaje;
    }
    @Override
    public String getMensaje() {
        return accion;
    }
}