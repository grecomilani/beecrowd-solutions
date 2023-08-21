package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1020 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int timeInDays = scn.nextInt();
        int daysAux;

        int years = timeInDays / 365;
        daysAux = timeInDays % 365;

        int months = daysAux / 30;
        daysAux = daysAux % 30;

        int days = daysAux;

        System.out.printf("%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)%n",years,months,days);
        scn.close();
    }
}
