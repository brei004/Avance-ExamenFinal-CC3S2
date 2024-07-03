package org.example;

import java.util.ArrayList;
import java.util.List;

public class FakeEstrategiaPrediccion implements IEstrategiaPrediccion {

    @Override
    public List<Evento> predecirSucesos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion) {
        List<Evento> eventos = new ArrayList<>();

        // Simulación de predicción de sucesos climáticos
        if (temperatura.getMedicion() > 30 && lluvia.getMedicion() > 20) {
            eventos.add(new Alertas("Posible tormenta"));
        } else if (viento.getMedicion() > 50) {
            eventos.add(new Alertas("Posible viento fuerte"));
        } else {
            eventos.add(new Notificaciones("Condiciones normales"));
        }

        return eventos;
    }
}
