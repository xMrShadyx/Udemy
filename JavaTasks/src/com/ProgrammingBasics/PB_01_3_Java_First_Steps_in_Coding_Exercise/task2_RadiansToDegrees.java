package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("%f", convert(scan.nextDouble()));
    }

    public static double convert(double rad) {
        return rad * 180 / Math.PI;
    }
}
