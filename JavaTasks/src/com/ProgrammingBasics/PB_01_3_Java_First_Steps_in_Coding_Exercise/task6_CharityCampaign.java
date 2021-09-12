package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task6_CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int amountChefs = Integer.parseInt(scan.nextLine());
        int amountCakes = Integer.parseInt(scan.nextLine());
        int amountWaffles = Integer.parseInt(scan.nextLine());
        int amountPanCakes = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f",charity(days, amountChefs, amountCakes, amountWaffles, amountPanCakes));

    }

    public static double charity(int days, int amountChefs, int amountCakes, int amountWaffles, int amountPanCakes) {
        double cakes = amountCakes * 45;
        double waffles = amountWaffles * 5.80;
        double pancakes = amountPanCakes * 3.20;
        double singleChef = (cakes + waffles + pancakes) * amountChefs;
        double totalProduct = singleChef * days;
        return totalProduct - (totalProduct / 8);
    }
}
