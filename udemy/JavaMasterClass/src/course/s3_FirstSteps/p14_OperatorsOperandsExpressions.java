package course.s3_FirstSteps;

public class p14_OperatorsOperandsExpressions {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);
        int prevResult = result;
        System.out.println(prevResult);
        result -= 1;
        System.out.println(result);
        result--;
        System.out.println(result);
        result *= 10; // 1 * 10 = 20;
        System.out.println(result);
        result /= 5;
        System.out.println(result);
        result = 20;

        result %= 3;
        System.out.println(result);

    }
}

// Operators in java are special symbols that perform specific operations on one, two or
// tree operands, and then return a result. As an example, we used the + (addition) operator
// to sum the value of two variables in a previous video.

// An operand is a term used to describe any object that is manipulated by an operator. If
// we consider this statement

// int myVar = 15 + 12;
// Then + is the operator, and 15 and 12 are the operands. Variables used instead of literals are also operands.

// double mySalary = hoursWorked * hourlyRate;
// In the above line hoursWorked and hourlyRate are operands, and * (multiplication) is the operator.
