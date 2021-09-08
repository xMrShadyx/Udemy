package course.s3_FirstSteps;

import java.util.stream.Stream;

public class p12_charAndBooleanTypes {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicode = '\u0044';
        char myUnicode1 = '\u00A9';

        // Char Primitive Type
        // A char occupies two bytes of memory, or 16 bits and thus has a width of 16. The reason it's
        // not just a single byte is that it allows you to store Unicode characters.
        // google -> unicode-table.com

        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myUnicode1);

        // Boolean Primitive Type
        // A boolean value allows for two choices True or False, Yes or No, 1 or 0. In java terms we
        // have a boolean primitive type, and it can be set to two values only. They are
        // actually pretty useful, and you will use them a lot when programming.

        boolean myTrueBool = true;
        boolean myFalseBool = false;

        boolean isCustomerOverTwentyOne = false;
    }
}
