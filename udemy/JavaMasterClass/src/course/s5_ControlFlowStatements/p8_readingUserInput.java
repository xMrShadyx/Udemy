package course.s5_ControlFlowStatements;

import java.util.Scanner;

public class p8_readingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your year of birth ");
        boolean hasNextInt = scan.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0) {
                System.out.println("Hello, " + name + " and you are " + age + " years old.");
            } else{
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Invalid year of birth.");
        }



        scan.close();
    }
}
