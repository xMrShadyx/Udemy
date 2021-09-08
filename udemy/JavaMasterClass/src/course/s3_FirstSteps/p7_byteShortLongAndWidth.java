package course.s3_FirstSteps;

public class p7_byteShortLongAndWidth {
    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Val: " + myMinByteValue);
        System.out.println("Byte Max Val: " + myMaxByteValue);

        // A Byte occupies 8 bit, A bit is not directly represented in a primitive type - We have a boolean
        // which is not really the same thing that we will discuss in a future video. So a Byte
        // occupies 8 bits. We say that a byte has a width of 8.

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Val: " + myMinShortValue);
        System.out.println("Short Max Val: " + myMaxShortValue);

        // A short can store a large range of numbers and occupies 16 bits, and has a width of 16.
        // An int, has much larger range as we know, and occupies 32 bits, and has a width of 32.

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Val: " + myMinLongValue);
        System.out.println("Long Max Val: " + myMaxLongValue);
    }
}
