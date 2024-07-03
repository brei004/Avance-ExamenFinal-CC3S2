package org.example;

import java.util.List;

public interface IEstrategiaEventos {
    List<Evento> definirEventos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion);
}
