package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 -y1,2));

        System.out.printf("%.4f%n",distance);

        scn.close();

    }
}
