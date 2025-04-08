package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Hexagono implements Calculable{
    private double lado;

    public Hexagono (double lado){
        this.lado = lado;
    }

    @Override
    public double calculableArea(){
        return ((3 * Math.sqrt(3)) / 2 ) * lado * lado;
    }
}
