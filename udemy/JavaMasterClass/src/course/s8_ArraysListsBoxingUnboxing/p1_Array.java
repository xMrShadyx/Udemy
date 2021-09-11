package course.s8_ArraysListsBoxingUnboxing;

import java.lang.reflect.Array;

public class p1_Array {
    public static void main(String[] args) {
        // One way
        int[] myVariable;
        myVariable = new int[10];

        // Better way
        int[] myIntArray = new int[25];
        myIntArray[5] = 50;
        myIntArray[2] = 20;
        myIntArray[7] = 70;

        for (int i: myIntArray) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }


        printArray(test(myIntArray));

    }

    public static int[] test(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value " + array[i]);
        }
    }
}
