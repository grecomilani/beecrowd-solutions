package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        int distanceTotal = scn.nextInt();
        double usedDiesel = scn.nextDouble();

        System.out.printf("%.3f km/l%n",distanceTotal/usedDiesel);

        scn.close();

    }
}
