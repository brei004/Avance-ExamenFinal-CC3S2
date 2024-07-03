package org.example;

import java.util.List;

public interface IEstrategiaPrediccion {
    List<Evento> predecirSucesos(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion);
}

