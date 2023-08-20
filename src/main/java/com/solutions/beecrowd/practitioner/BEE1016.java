package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1016 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int distance = scn.nextInt();
        int time = distance * 2;

        System.out.println(time + " minutos");

        scn.close();

    }
}
