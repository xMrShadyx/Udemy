package a1_Challenges;

import java.util.Scanner;

public class a29_inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numCounter = 0;
        double avg = 0;

        while (true) {
            boolean hasInt = scan.hasNextInt();
            if (hasInt) {
                int number = scan.nextInt();
                sum += number;
            } else {
                avg = Math.round((double) sum / numCounter);
                System.out.println("SUM = " + sum + " AVG = " + (int) avg);
                break;
            }
            scan.nextLine();
            numCounter++;
        }
    }
}
