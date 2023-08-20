package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double weightA = 2.0;
        double weightB = 3.0;
        double weightC = 5.0;

        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        double average = (a * weightA + b * weightB + c * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f%n",average);
        scn.close();

    }
}
