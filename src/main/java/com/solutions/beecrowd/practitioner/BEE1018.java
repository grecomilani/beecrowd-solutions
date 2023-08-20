package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1018 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int amount = scn.nextInt();

        int amountAux = amount;

        int notes100 = amountAux / 100;
        amountAux %= 100;

        int notes50 = amountAux / 50;
        amountAux %= 50;

        int notes20 = amountAux / 20;
        amountAux %= 20;

        int notes10 = amountAux / 10;
        amountAux %= 10;

        int notes5 = amountAux / 5;
        amountAux %= 5;

        int notes2 = amountAux / 2;
        amountAux %= 2;

        int notes1 = amountAux / 1;
        amountAux %= 1;

        System.out.println(amount);
        System.out.printf("%d nota(s) de R$ 100,00\n" +
                "%d nota(s) de R$ 50,00\n" +
                "%d nota(s) de R$ 20,00\n" +
                "%d nota(s) de R$ 10,00\n" +
                "%d nota(s) de R$ 5,00\n" +
                "%d nota(s) de R$ 2,00\n" +
                "%d nota(s) de R$ 1,00%n",
                notes100,notes50,notes20,notes10,notes5,notes2,notes1);

        scn.close();

    }
}
