package a3_Challenges.MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(readInteger());
    }

    public static int readInteger() {
        int count = scan.nextInt();
        return count;
    }

    public static int[] readElements(int count) {
        int[] newArray = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = scan.nextInt();
        }

        return newArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
