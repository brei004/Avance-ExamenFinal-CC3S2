package org.example;

public class Viento implements Condicion{
    private final float medicion;
    private final int UMBRAL_ALTO= 70;
    private final int UMBRAL_BAJO= 10;

    public Viento(float medicion) {
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
