package course.s5_ControlFlowStatements;

import java.util.Scanner;

public class p9_userInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int sum = 0;
        int counter = 1;

            while (true) {
                System.out.print("Enter number# " + counter +": ");
                boolean hasNextInt = scan.hasNextInt();
                if (hasNextInt) {
                    int number = scan.nextInt();
                    sum += number;
                    if (counter == 10) {
                        break;
                    }
                    counter++;
                } else {
                    System.out.println("Invalid Number");
                }
                scan.nextLine();
            }

        System.out.println("Total sum is: " + sum);
        scan.close();
    }
}
