package a1_Challenges;

public class a23_greatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int result = 0;
        int bigger = Math.max(first, second);

        for (int i = bigger; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
