package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task4_InchesToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        System.out.println(convert(num));

    }

    public static double convert(double num) {
        return num * 2.54;
    }

}
