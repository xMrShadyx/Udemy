package a1_Challenges;

public class a20_evenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-1));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0 ) {
            return -1;
        }
        int result = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                result += currentDigit;
            }
            number /= 10;
        }

        return result;
    }
}
