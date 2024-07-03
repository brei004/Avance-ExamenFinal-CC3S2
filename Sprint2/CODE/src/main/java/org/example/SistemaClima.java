package org.example;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class SistemaClima {
    private EstrategiaEventoOriginal estrategiaEventos;
    private FakeEstrategiaPrediccion estrategiaPrediccion;


    public SistemaClima(EstrategiaEventoOriginal estrategiaEventos, FakeEstrategiaPrediccion estrategiaPrediccion) {
        this.estrategiaEventos = estrategiaEventos;
        this.estrategiaPrediccion = estrategiaPrediccion;
    }

    public List<Evento> definirEventos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion) {
        return estrategiaEventos.definirEventos(temperatura, lluvia, viento, humedad, presion);
    }

    public List<Evento> predecirSucesos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion) {
        return estrategiaPrediccion.predecirSucesos(temperatura, lluvia, viento, humedad, presion);
    }

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(30);
        Lluvia lluvia = new Lluvia(20);
        Viento viento = new Viento(40);
        Humedad humedad = new Humedad(60);
        Presion presion = new Presion(1000);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());


        List<Evento> eventos = sistemaClima.definirEventos(temperatura, lluvia, viento, humedad, presion);

        System.out.println("Eventos generados:");
        for (Evento evento : eventos) {
            System.out.println(evento.getMensaje());
        }

        List<Evento> sucesos = sistemaClima.predecirSucesos(temperatura, lluvia, viento, humedad, presion);

        System.out.println("\nSucesos predichos:");
        for (Evento suceso : sucesos) {
            System.out.println(suceso.getMensaje());
        }
    }

}
