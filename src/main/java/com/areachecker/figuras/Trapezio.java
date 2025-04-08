package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Trapezio implements Calculable {
    private double altura;
    private double baseA;
    private double baseB;

    public Trapezio(double altura, double baseA, double baseB){
        this.altura = altura;
        this.baseA = baseA;
        this.baseB = baseB;
    }

    @Override
    public double calculableArea(){
        return ((baseA + baseB) *  altura) /2;
    }
}
