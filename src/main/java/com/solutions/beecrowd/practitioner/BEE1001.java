package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.printf("X = %d%n",a+b);

        scn.close();
    }
}
