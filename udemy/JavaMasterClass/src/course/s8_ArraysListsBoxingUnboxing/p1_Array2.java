package course.s8_ArraysListsBoxingUnboxing;

import java.util.Scanner;

public class p1_Array2 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }

        System.out.println("The average is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        return (double) sum / (double) array.length;
    }
}
