package a1_Challenges;

public class a16_numberPalindrome {
    // Write a method called isPalindrome with one int parameter called number.
    // The method needs to return a boolean
    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }

    public static boolean isPalindrome(int number) {
        int backResult = 0;
        int safeResult = number;
        while (safeResult != 0) {
            int remainder = safeResult % 10;
            backResult = backResult * 10 + remainder;
            safeResult /= 10;
        }
        return backResult == number;
    }
}
