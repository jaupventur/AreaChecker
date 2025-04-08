package com.areachecker;

import com.areachecker.factory.ShapeFactoryImpl;

public class Main {
    public static void main(String[] args) {
        Calculable quadrado = ShapeFactoryImpl.criarFigura(ShapeType.Quadrado, 5);
        Calculable retangulo = ShapeFactoryImpl.criarFigura(ShapeType.Retangulo, 4, 6);
        Calculable circulo = ShapeFactoryImpl.criarFigura(ShapeType.Circulo, 3);
        Calculable triangulo = ShapeFactoryImpl.criarFigura(ShapeType.Triangulo, 5, 6);
        Calculable paralelogramo = ShapeFactoryImpl.criarFigura(ShapeType.Paralelogramo, 4, 6);
        Calculable trapezio = ShapeFactoryImpl.criarFigura(ShapeType.Trapezio, 5, 6, 7);
        Calculable hexagono = ShapeFactoryImpl.criarFigura(ShapeType.Hexagono, 4);
        Calculable losango = ShapeFactoryImpl.criarFigura(ShapeType.Losango, 5, 6);
        Calculable cubo = ShapeFactoryImpl.criarFigura(ShapeType.Cubo, 4);

        System.out.println("Área do quadrado: " + quadrado.calculableArea());
        System.out.println("Área do retângulo: " + retangulo.calculableArea());
        System.out.println("Área do círculo: " + circulo.calculableArea());
        System.out.println("Área do triângulo: " + triangulo.calculableArea());
        System.out.println("Área do paralelogramo: " + paralelogramo.calculableArea());
        System.out.println("Área do trapézio: " + trapezio.calculableArea());
        System.out.println("Área do hexágono: " + hexagono.calculableArea());
        System.out.println("Área do losango: " + losango.calculableArea());
        System.out.println("Área do cubo: " + cubo.calculableArea());
    }
}