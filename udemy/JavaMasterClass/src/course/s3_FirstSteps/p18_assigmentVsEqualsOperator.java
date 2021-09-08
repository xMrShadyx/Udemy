package course.s3_FirstSteps;

public class p18_assigmentVsEqualsOperator {
    public static void main(String[] args) {
        int newValue = 50;
        // if (newValue = 50) {
        // System.out.println("This is an error.");
        // }
        // As you can see in the code we typed to declare the newValue int, it's using the assignment operator (one equal sign)
        // to assign the value 50 to newValue.
        // What we needed to do in the code is to not use the assignment operator in the if-then
        // statement, but rather the equal to operator which has two equal signs.

        //This is what the code should like:
        if (newValue == 50) {
            System.out.println("This is correct way.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        // The ! or NOT Operator is also known as the Logical Complement Operator.
        // For use with booleans it tests the alternate value - we saw (isCar) tests for true, by adding
        // a ! operator before the value we can check the opposite - false in this case.
        // boolean isCar = false;
        // We can use either of these statements:
        // if (isCar == false)
        // if (!isCar)
        // to check if the boolean isCar is false.
    }
}
