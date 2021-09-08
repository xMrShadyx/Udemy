package course.s5_ControlFlowStatements;

public class p6_digitSumChallenge {
    // Write a method with the name sumDigits that has one int parameter called number
    // if parameter is >= 10 then the method should process the number and return sum of all
    // digits, otherwise return -1 to indicate an invalid value.

    // The numbers from 0-9 have 1 digit, so we don't want to process them, also we don't
    // want to process negative numbers, so also return -1 for negative numbers.

    // for example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    // Calling the method sumDigits(1) should return -1 as per requirements described above.

    // Add some code to the main method to test out the sumDigits method to determine
    // that it is working correctly for valid and invalid values passed as arguments.

    // Hints:
    // Use n % 10 to extract the least-significant digits.
    // Use n = n / 10 to discard the least-significant digit.
    // The method needs to be static like other methods so far in the course.
    public static void main(String[] args) {
        System.out.println(sumDigits(208));
        System.out.println(sumDigits(-5));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(11111));
    }

    public static int sumDigits(int number) {
        int result = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

}
