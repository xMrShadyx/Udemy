package com.ProgrammingBasics.PB_01_2_Java_First_Steps_in_Coding_Lab;

import java.util.Scanner;

public class task7_ProjectCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(projectCreation(scan.nextLine(), scan.nextInt()));

    }

    public static String projectCreation(String name, int amountProjects) {
        return String.format("The architect %s will need %d hours to complete %d project/s.", name, amountProjects * 3, amountProjects);
    }
}
