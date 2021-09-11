package course.s8_ArraysListsBoxingUnboxing;

import java.util.Scanner;

public class p4_MinimumElementChallenge {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Min Number is: " + findMin(readIntegers(5)));
    }

    public static int[] readIntegers(int count) {
        int[] newArray = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = scan.nextInt();
        }
        return newArray;
    }

    public static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < temp) {
                temp = j;
            }
        }
        return temp;
    }


}
