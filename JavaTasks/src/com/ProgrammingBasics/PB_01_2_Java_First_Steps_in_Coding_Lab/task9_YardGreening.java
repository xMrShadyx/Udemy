package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task9_YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(yardGreening(scan.nextDouble()));

    }

    public static String yardGreening(double squareMeters) {
        double price = squareMeters * 7.61;
        double discount = price * 0.18;
        return String.format("The final price is: %.2f lv.%nThe discount is: %.2f lv.", price - discount, discount);
    }
}
