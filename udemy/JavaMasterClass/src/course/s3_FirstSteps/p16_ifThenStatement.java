package course.s3_FirstSteps;

public class p16_ifThenStatement {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score");
        }
    }
}

// The if-then statement is the most basic of all the control flow statements. It tells your
// program to execute a certain section of code only if a particular test evaluates to true.

// This is known as Conditional logic.
// Conditional logic uses specific statements in Java to allow us to check a condition and
// execute certain code based on whether that condition (the expression) is true or false.

// Code block:
// instead of using if-statement as we can see here, we should instead of use a code block
// A code block allows more than one statement to be executed - a block of code.

// The format is:
// if (expression) {
//   put one or more statement here
// }