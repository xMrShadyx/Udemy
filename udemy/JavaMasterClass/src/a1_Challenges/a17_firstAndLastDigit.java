package a1_Challenges;

public class a17_firstAndLastDigit {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0 ) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }
        int firstDigit = 0;
        int lastDigit = 0;

        // find last digit
        lastDigit = number%10;

        int digits = (int)(Math.log10(number));
        // Find first digit
        firstDigit = (int)(number / (int)(Math.pow(10, digits)));

    return lastDigit + firstDigit;
    }
}
