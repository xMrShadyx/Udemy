package com.ProgrammingBasics.PB_01_3_Java_First_Steps_in_Coding_Exercise;

import java.util.Scanner;

public class task4_VacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(reader(Integer.parseInt(scan.nextLine()),
                Integer.parseInt(scan.nextLine()),
                Integer.parseInt(scan.nextLine())));
    }

    public static int reader(int amountPages, int pages, int days) {
        return (amountPages / pages) / days;
    }

}
