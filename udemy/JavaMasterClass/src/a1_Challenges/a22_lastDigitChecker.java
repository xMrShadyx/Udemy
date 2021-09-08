package a1_Challenges;

public class a22_lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 9999));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!(isValid(num1) && isValid(num2) && isValid(num3))) {
            return false;
        }

        int compareN1 = num1 % 10;
        int compareN2 = num2 % 10;
        int compareN3 = num3 % 10;

        if ((compareN1 == compareN2 || compareN1 == compareN3) || (compareN2 == compareN3)){
            return true;
        }
        return false;
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }
}
