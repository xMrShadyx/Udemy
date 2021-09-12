package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task5_GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        greeting(name);
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
