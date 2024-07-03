package org.example;

import java.util.ArrayList;
import java.util.List;

public class EstrategiaEventoOriginal implements IEstrategiaEventos {
    @Override
    public  List<Evento> definirEventos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion) {
        List<Evento> eventos = new ArrayList<>();

        if (lluvia.isFar()) {eventos.add(new Alertas("Lluvia intensa"));
        }
        if (viento.isFar()) {eventos.add(new Alertas("Viento fuerte intensa"));
        }
        if (temperatura.isFar() && humedad.isFar()) {
            eventos.add(new Automatico("Activar Sistema de riego"));
        }
        if (viento.isFar() || temperatura.isFar()) {eventos.add(new Automatico("Cerrar Persianas"));
        }
        if (presion.isnotEnough()) {eventos.add(new Notificaciones("poca presion en la zona"));
        }
        return eventos;
    }

}
