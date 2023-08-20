package com.solutions.beecrowd.practitioner;

import java.util.Scanner;

public class BEE1019 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int totalSeconds = scn.nextInt();

        int hours = totalSeconds / 3600;
        int secondsRemaining = totalSeconds % 3600;

        int minutes = secondsRemaining / 60;
        int finalSeconds = secondsRemaining % 60;

        System.out.printf("%2d:%2d:%2d%n", hours, minutes, finalSeconds);
        scn.close();
    }
}
