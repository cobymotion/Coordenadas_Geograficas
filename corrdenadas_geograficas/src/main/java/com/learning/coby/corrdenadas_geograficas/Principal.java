package com.learning.coby.corrdenadas_geograficas;

public class Principal {

    public static void main(String[] args) {

        GeoPunto place1 = new GeoPunto(80,-130);
        GeoPunto place2 = new GeoPunto(80,-130.32);
        System.out.println(place1.distancia(place2));

    }

}
