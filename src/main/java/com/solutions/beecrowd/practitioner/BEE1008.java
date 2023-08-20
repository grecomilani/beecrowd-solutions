package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scn = new Scanner(System.in);

        int numberEmployee = scn.nextInt();
        int workedHours = scn.nextInt();
        double valuePerHour = scn.nextDouble();

        System.out.printf("NUMBER = %d%n",numberEmployee);
        System.out.printf("SALARY = U$ %.2f%n",workedHours*valuePerHour);

        scn.close();

    }
}
