package course.s3_FirstSteps;

public class p10_floatAndDoublePrimitiveTypes {
    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float min val = " + myMinFloat);
        System.out.println("Float max val = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double min val = " + myMinDouble);
        System.out.println("Double max val = " + myMaxDouble);

        int myVal = 5;
        float myFloatVal = 5f;
        double myDouble = 5d;

    }

    // Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal
    // point 3.14159 is an example.

    //Precision refers to the format and amount of space occupied by the type. Single precision
    // occupies 32 bits (so has a width of 32) and a Double precision occupies 64 bit (and thus has a width of 64)

    // As a result the float has a range from 1.4E-45 to 3.4028235E+38 and the double is much
    // more precise with a range from 4.9E-324 to 1.7976931348623157E+308.
}
