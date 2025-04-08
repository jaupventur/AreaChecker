package com.areachecker.factory;

import com.areachecker.Calculable;
import com.areachecker.ShapeType;
import com.areachecker.figuras.*;

public class ShapeFactoryImpl {
    public static Calculable criarFigura(ShapeType tipo, double... args) {
        switch (tipo) {
            case Quadrado:
                return new Quadrado(args[0]);
            case Retangulo:
                return new Retangulo(args[0], args[1]);
            case Circulo:
                return new Circulo(args[0]);
            case Triangulo:
                return new Triangulo(args[0], args[1]);
            case Paralelogramo:
                return new Paralelogramo(args[0], args[1]);
            case Trapezio:
                return new Trapezio(args[0], args[1], args[2]);
            case Hexagono:
                return new Hexagono(args[0]);
            case Losango:
                return new Losango(args[0], args[1]);
            case Cubo:
                return new Cubo(args[0]);
            default:
                return null;
        }
    }
}