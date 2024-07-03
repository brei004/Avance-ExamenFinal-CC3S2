package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class SistemaTest {

    @Test
    public void testAlertaLluviaIntensa() {
        Temperatura temperaturaStub = new Temperatura(35);
        Lluvia lluviaStub = new Lluvia(60);
        Viento vientoStub = new Viento(55);
        Humedad humedadStub = new Humedad(0);
        Presion presionStub = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperaturaStub,lluviaStub,vientoStub,humedadStub,presionStub);
        assertTrue(eventos.stream().anyMatch(evento -> evento instanceof Alertas && evento.getMensaje().equals("Alerta de Lluvia intensa")));
    }
    @Test
    public void testVientoIntensa() {
        Temperatura temperaturaStub = new Temperatura(35);
        Lluvia lluviaStub = new Lluvia(60);
        Viento vientoStub = new Viento(80);
        Humedad humedadStub = new Humedad(0);
        Presion presionStub = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperaturaStub,lluviaStub,vientoStub,humedadStub,presionStub);
        assertTrue(eventos.stream().anyMatch(evento -> evento instanceof Alertas && evento.getMensaje().equals("Alerta de Viento fuerte intensa")));
    }

    @Test
    public void testAltaTempYAltaHumedad() {
        Temperatura temperaturaStub = new Temperatura(70);
        Lluvia lluviaStub = new Lluvia(60);
        Viento vientoStub = new Viento(80);
        Humedad humedadStub = new Humedad(70);
        Presion presionStub = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperaturaStub,lluviaStub,vientoStub,humedadStub,presionStub);
        assertTrue(eventos.stream().anyMatch(evento -> evento instanceof Automatico && evento.getMensaje().equals("Activar Sistema de riego")));
    }

    @Test
    public void testAccionCerrarPersianas() {
        Temperatura temperaturaStub = new Temperatura(70);
        Lluvia lluviaStub = new Lluvia(60);
        Viento vientoStub = new Viento(55);
        Humedad humedadStub = new Humedad(0);
        Presion presionStub = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperaturaStub,lluviaStub,vientoStub,humedadStub,presionStub);
        assertTrue(eventos.stream().anyMatch(evento -> evento instanceof Automatico && evento.getMensaje().equals("Cerrar Persianas")));
    }

    @Test
    public void testNotificacionPocaPresion() {
        Temperatura temperaturaStub = new Temperatura(30);
        Lluvia lluviaStub = new Lluvia(60);
        Viento vientoStub = new Viento(55);
        Humedad humedadStub = new Humedad(0);
        Presion presionStub = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(new EstrategiaEventoOriginal(), new FakeEstrategiaPrediccion());
        List<Evento> eventos = sistemaClima.definirEventos(temperaturaStub,lluviaStub,vientoStub,humedadStub,presionStub);
        assertTrue(eventos.stream().anyMatch(evento -> evento instanceof Notificaciones && evento.getMensaje().equals("Envio de notificacion a usuarios sobre poca presion en la zona")));
    }
}

