package com.areachecker.figuras;

import com.areachecker.Calculable;

public class Losango implements Calculable {
    private double diagonalA;
    private double diagonalB;

    public Losango (double diagonalA, double diagonalB){
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
    }

    @Override
    public double calculableArea(){
        return (diagonalA + diagonalB)/2;
    }
}

