package course.s8_ArraysListsBoxingUnboxing;

import java.util.Arrays;
import java.util.Scanner;

public class p5_ReverseArrayChallenge {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int count = scan.nextInt();
        int[] firstArray = arrayNormal(count);
        int[] reversedArray = reverseArray(firstArray);

        for (int n: reversedArray) {
            System.out.print(n + " ");
        }

    }

    public static int[] arrayNormal(int count) {
        int[] newArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter Number: ");
            newArray[i] = scan.nextInt();
        }
        return newArray;
    }

    public static int[] reverseArray(int[] array) {
        System.out.println("This is reversedArray");
        int[] reversedArray = new int[array.length];

        int i = 0;
        while (i < array.length) {
            reversedArray[array.length - 1 - i] = array[i];
            i++;
        }
        return reversedArray;
    }
}
