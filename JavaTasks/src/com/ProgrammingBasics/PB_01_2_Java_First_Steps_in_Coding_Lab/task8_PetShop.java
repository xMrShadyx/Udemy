package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task8_PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(petShop(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine())) + " lv.");
    }

    public static double petShop(int dogs, int otherAnimals) {
        return (dogs * 2.50) + (otherAnimals * 4);

    }
}
