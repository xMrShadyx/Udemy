package a1_Challenges;

public class a21_sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));

    }

    public static boolean hasSharedDigit(int number, int secondNum) {
        if ((number <= 10 || number > 100) || (secondNum <= 10 || secondNum > 100)) {
            return false;
        }
        while (number > 0) {
            int numToIter = number % 10;
            if (Integer.toString(secondNum).contains(Integer.toString(numToIter))) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
