package course.s3_FirstSteps;

public class p13_primitiveTypeRecapAndString {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String
        // The String is a datatype in java, which  is not a primitive type. It's actually a Class, but it
        // enjoys a bit of favoritism in java to make it easier to use than a regular class.

        // A String is a sequence of characters. In the case of the char which you can see above which
        // we discussed in the previous video, it could contain a single character only (regular
        // character or Unicode character).

        // A String can contain a sequence of characters. A large number of characters. Technically
        // it's limited by memory or the MAX_VALUE of an int which was 2.14 Billion. That's a lot of characters.

        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);
        myString = myString + " and this is more....";
        System.out.println("My string is equal to: " + myString);
        myString = myString + " \u00A9 2020.";
        System.out.println(myString);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double dobNum = 120.44d;
        lastString += dobNum;
        System.out.println(lastString);

        // Strings in java are immutable

        // When I said you can delete characters out of a String, that's not strictly true. Because
        // Strings in Java are immutable. That means you can't change a String after it's created.
        // instead, what happens is a new String is created.

        // So in case of this code, lastString doesn't get appended the value "120.47" instead a
        // new String is created which consists of the previous value of lastString plus a text
        // representation of the double value 120.47.

        // The net result is the same, lastString has the right values, however, a new String got created
        // and the old one got discarded.

        // As a result of a String being created, appending values like this is inefficient and not
        // recommended. I'll show you a better way of doing it in a future video where we discuss
        // something called a StringBuffer which can be changed.

        // We need an understanding of classes before we tackle StringBuffer, and also, you will come
        // across code written in the style I've used in this lecture, so it's still useful for you to know
        // how to do things this way.


    }
}
