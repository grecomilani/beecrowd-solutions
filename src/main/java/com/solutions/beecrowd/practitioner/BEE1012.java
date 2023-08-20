package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {

    public static double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        double triangleArea = 0.5 * a * c;
        double circleArea = 3.14159 * c * c;
        double trapezoidArea = 0.5 * (a + b) * c;
        double squareArea = b * b;
        double rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoidArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);

        scn.close();

    }
}
