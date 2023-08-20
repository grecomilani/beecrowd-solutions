package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1017 {

    public static final int LITERS_PER_KM = 12;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int time = scn.nextInt();
        int averageSpeed = scn.nextInt();
        double distance = averageSpeed * time;

        double litersUsed = distance / LITERS_PER_KM;

        System.out.printf("%.3f%n",litersUsed);

        scn.close();

    }
}
