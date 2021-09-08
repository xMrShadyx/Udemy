package a1_Challenges;

public class a6_EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }

    public static boolean hasEqualSum(int num1, int num2, int equalTo) {
        return ((num1 + num2) == equalTo);
    }

}
