package org.example;

public class Humedad implements Condicion{
    private final float medicion;
    private final int UMBRAL_ALTO= 30;
    private final int UMBRAL_BAJO= 10;

    public Humedad(float medicion) {
        this.medicion = medicion;
    }
    @Override
    public float getMedicion() {
        return medicion;
    }

    @Override
    public boolean isFar() {
        return medicion>=UMBRAL_ALTO;
    }

    @Override
    public boolean isnotEnough() {
        return medicion<UMBRAL_BAJO;
    }
}
