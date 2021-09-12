package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task6_ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = concatenateString(scan.nextLine(), scan.nextLine(), Integer.parseInt(scan.nextLine()), scan.nextLine());
        System.out.println(result);
    }

    public static String concatenateString(String firstName, String lastName, int age, String town) {
        return String.format("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
