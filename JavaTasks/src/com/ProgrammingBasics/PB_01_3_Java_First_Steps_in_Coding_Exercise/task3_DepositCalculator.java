package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(calculator(Double.parseDouble(scan.nextLine()), Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine())));
    }

    public static double calculator(double depositPrice, int depositTime, double annualPercent) {
        double firstCalc = depositPrice * annualPercent;
        double secondCalc = (firstCalc / 100) / 12;
        return depositPrice + (depositTime * secondCalc);
    }
}
