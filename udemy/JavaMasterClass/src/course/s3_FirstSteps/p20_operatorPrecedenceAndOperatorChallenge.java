package course.s3_FirstSteps;

public class p20_operatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {

        double firstVal = 20.00;
        double secondVal = 80.00;

        double result = (firstVal + secondVal) * 100;
        System.out.println(result);
        double ifRemainder = result % 40.00;
        System.out.println(ifRemainder);

        boolean isRemainder = ifRemainder == 0 ? true : false;
        System.out.println(isRemainder);

        if (isRemainder) {
            System.out.println("Got some remainder");
        }

    }
}

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
// http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html