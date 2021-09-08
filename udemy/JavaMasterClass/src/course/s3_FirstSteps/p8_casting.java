package course.s3_FirstSteps;

public class p8_casting {
    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Int min val: " + minIntValue);
        System.out.println("Int max val: " + maxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Val: " + myMinByteValue);
        System.out.println("Byte Max Val: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Val: " + myMinShortValue);
        System.out.println("Short Max Val: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Val: " + myMinLongValue);
        System.out.println("Long Max Val: " + myMaxLongValue);

        int myTotal = (minIntValue / 2);

        byte newByteVal = (byte) (minIntValue / 2);
        // Casting means to treat or convert a number from one type to another. We put the type we want
        // number to be in parentheses like this:
        // (byte) (minIntValue / 2);

        short myNewShort = (short) (myMinShortValue / 2);
    }
}
