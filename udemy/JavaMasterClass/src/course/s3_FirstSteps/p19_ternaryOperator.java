package course.s3_FirstSteps;

public class p19_ternaryOperator {
    public static void main(String[] args) {

        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }

    }

    // The ternary operator is a shortcut to assigning one of two values to a variable depending
    // on a given condition.
    // It's a shortcut of the if-then-else statement (else we will discuss later).

    // int ageOfClient = 20;
    // boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
    // Operand one - ageOfClient == 20 in this case is the condition we are checking. It needs to
    // return true of false.
    // Operand two - true here is the value to assign to the variable isEighteenOrOver if the
    // condition above is true
    // Operand three - true here is the value to assign to the variable isEighteenOrOver if the
    // condition above is true
    // In this case, isEighteenOrOver is assigned the value true because ageOfClient has the value 20.
    // It can be good idea to use parentheses like this to make the code more readable.
    // boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
}
