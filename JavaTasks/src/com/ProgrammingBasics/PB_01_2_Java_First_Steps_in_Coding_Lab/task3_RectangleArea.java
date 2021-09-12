package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task3_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(rectangleArea(num1, num2));
    }

    public static int rectangleArea(int num, int num2) {
        return num * num2;
    }
}

