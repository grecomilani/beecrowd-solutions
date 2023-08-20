package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scn = new Scanner(System.in);

        int partCode1 = scn.nextInt();
        int quantity1 = scn.nextInt();
        double unitPrice1 = scn.nextDouble();

        int partCode2 = scn.nextInt();
        int quantity2 = scn.nextInt();
        double unitPrice2 = scn.nextDouble();

        double totalValue = (quantity1 * unitPrice1) + (quantity2 * unitPrice2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);

        scn.close();

    }
}
