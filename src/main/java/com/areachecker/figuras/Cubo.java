package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Cubo implements Calculable{
    private double aresta;

    public Cubo(double aresta){
        this.aresta = aresta;
    }

    @Override
    public double calculableArea(){
        return 6 * aresta * aresta;
    }

}
