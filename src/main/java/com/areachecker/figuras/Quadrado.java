package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Quadrado implements Calculable {
    private double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculableArea(){
        return lado*lado;
    }
}
