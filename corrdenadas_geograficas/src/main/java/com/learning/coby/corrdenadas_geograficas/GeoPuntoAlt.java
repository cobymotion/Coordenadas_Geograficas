package com.learning.coby.corrdenadas_geograficas;

public class GeoPuntoAlt extends GeoPunto {


    private double altitud;

    public GeoPuntoAlt(double latitud, double longitud, double altitud) {
        super(latitud, longitud);
        this.altitud = altitud;
    }

    public double distancia(GeoPuntoAlt punto) {

        double distanciaAnterior = super.distancia(punto);
        double diferenciaAlturas = this.altitud - punto.getAltitud();

        double distancia_nueva = Math.sqrt(Math.pow(distanciaAnterior,2) + Math.pow(diferenciaAlturas,2));

        return distancia_nueva;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
}
