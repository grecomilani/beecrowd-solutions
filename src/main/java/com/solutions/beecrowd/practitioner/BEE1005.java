package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double weightA = 3.5;
        double weightB = 7.5;

        double a = scn.nextDouble();
        double b = scn.nextDouble();

        double average = (a * weightA + b * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f%n",average);
        scn.close();

    }
}
