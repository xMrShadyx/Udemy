package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task1_USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(convertMoney(scan.nextDouble()));
    }

    public static double convertMoney(double money) {
        return money * 1.79549;
    }
}
