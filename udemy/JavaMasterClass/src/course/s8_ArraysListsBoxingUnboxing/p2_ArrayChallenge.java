package course.s8_ArraysListsBoxingUnboxing;

import java.util.Arrays;
import java.util.Scanner;

public class p2_ArrayChallenge {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);


        printArray(myIntegers);
        System.out.println();

        for (int i: sortIntegers(myIntegers)) {
            System.out.print(i + " ");
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] newArray = new int[array.length];

        for (int i = array.length; i > 0 ; i--) {
            newArray[array.length - i] = array[i - 1];
        }
        return newArray;
    }

    public static int[] sortedIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
