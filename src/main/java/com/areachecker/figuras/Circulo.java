package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Circulo implements Calculable {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculableArea(){
        return Math.PI * raio * raio;
    }
}
