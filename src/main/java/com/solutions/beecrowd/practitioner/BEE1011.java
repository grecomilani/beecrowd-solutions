package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {

    public static double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double radius = scn.nextDouble();

        double sphereVolume = (4.0/3) * PI * Math.pow(radius,3);

        System.out.printf("VOLUME = %.3f%n",sphereVolume);

        scn.close();

    }
}
