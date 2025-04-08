package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Retangulo implements Calculable{
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculableArea() {
        return largura*altura;
    }
}
