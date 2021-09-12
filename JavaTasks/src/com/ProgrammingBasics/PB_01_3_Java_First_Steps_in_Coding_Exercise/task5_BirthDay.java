package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task5_BirthDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hallRent = scan.nextDouble();
        System.out.println(partyExpenses(hallRent));
    }

    public static double partyExpenses(double hallRent) {

        double cakePrice = hallRent * 0.20;
        double drinks = cakePrice - (cakePrice * 0.45);
        double animator = hallRent / 3;


        return cakePrice + drinks + animator + hallRent;
    }
}
