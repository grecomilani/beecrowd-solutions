package com.solutions.beecrowd.practitioner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1013 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int biggest = (a + b + Math.abs(a-b)) / 2;

        if(biggest < c){
            biggest = c;
        }

        System.out.printf("%d eh o maior",biggest);

        scn.close();

    }
}
