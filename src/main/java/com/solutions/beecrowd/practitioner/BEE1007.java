package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        System.out.printf("DIFERENCA = %d%n",a*b-c*d);

        scn.close();

    }
}
