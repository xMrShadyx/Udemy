package course.s5_ControlFlowStatements;

import java.util.Scanner;

public class p10_minAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter Number: ");
            boolean hasInt = scan.hasNextInt();
            if (hasInt) {
                int num = scan.nextInt();

                if (num > maxValue) {
                    maxValue = num;
                }
                if (num < minValue) {
                    minValue = num;
                }
            } else {
                System.out.println("Min and Max Value are: " + minValue + "/" + maxValue);
                break;
            }
        }
        scan.close();
    }
}
