package course.s3_FirstSteps;

public class p6_PrimitiveTypes {
    public static void main(String[] args) {
        // int MyValue = 1000;
        // Java uses the concept of a Wrapper class for all eight primitive types - in the case of an int,
        // we can use Integer, and by doing that it gives us ways to perform operations on an int.
            int minIntValue = Integer.MIN_VALUE;
            int maxIntValue = Integer.MAX_VALUE;
            System.out.println("Int min val: " + minIntValue);
            System.out.println("Int max val: " + maxIntValue);
            System.out.println("Busted MAX value = " + maxIntValue + 1);
            // if you try and put a value larger than the max value in java, or a value smaller than
            // minimum value in java, then you will get and overflow in the case of the max value
            // or an underflow in the case of the minimum

        // in this case, we are using the MIN_VALUE and MAX_VALUE to get Java to tell us the
        // minimum and maximum ranges of numbers that can be stored.


    }
}

// Java primitive types are the most basic data types. The int is one of eight primitive types.

// The eight primitive data types in Java are boolean, byte, char, short, int, long, float and double.
// Consider these types as the building blocks of data manipulation. Let's explore the eight
// primitive types in java.