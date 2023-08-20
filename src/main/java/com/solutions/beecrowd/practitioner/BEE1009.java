package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scn = new Scanner(System.in);

        String nameEmployee = scn.next();
        double salary = scn.nextDouble();
        double totalSales = scn.nextDouble();

        double bonus = totalSales * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n",salary+bonus);

        scn.close();

    }
}
