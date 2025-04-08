package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Paralelogramo implements Calculable {
    private double base;
    private double altura;

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculableArea(){
        return (base *altura);

    }
}
