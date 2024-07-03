package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FakeEstrategiaPrediccionTest {

    @Test
    public void testDefinirEventos_ConCondicionesNormales() {
        Temperatura temperatura = new Temperatura(25);
        Lluvia lluvia = new Lluvia(10);
        Viento viento = new Viento(30);
        Humedad humedad = new Humedad(50);
        Presion presion = new Presion(1000);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperatura, lluvia, viento, humedad, presion);

        assertEquals(0, eventos.size());
    }

    @Test
    public void testPredecirSucesos_ConCondicionesNormales() {
        Temperatura temperatura = new Temperatura(25);
        Lluvia lluvia = new Lluvia(10);
        Viento viento = new Viento(30);
        Humedad humedad = new Humedad(50);
        Presion presion = new Presion(1000);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> sucesos = sistemaClima.predecirSucesos(temperatura, lluvia, viento, humedad, presion);

        assertEquals(1, sucesos.size());
        assertEquals("Envio de notificacion a usuarios sobre Condiciones normales", sucesos.get(0).getMensaje());
    }

    @Test
    public void testPredecirSucesos_ConTormentaPosible() {
        Temperatura temperatura = new Temperatura(35);
        Lluvia lluvia = new Lluvia(25);
        Viento viento = new Viento(40);
        Humedad humedad = new Humedad(60);
        Presion presion = new Presion(1000);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> sucesos = sistemaClima.predecirSucesos(temperatura, lluvia, viento, humedad, presion);

        assertEquals(1, sucesos.size());
        assertEquals("Alerta de Posible tormenta", sucesos.get(0).getMensaje());
    }
}
