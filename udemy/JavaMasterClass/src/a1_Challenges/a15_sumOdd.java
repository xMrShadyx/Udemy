package a1_Challenges;

public class a15_sumOdd {
    public static void main(String[] args) {
//        System.out.println(sumOdd(1, 100));
//        System.out.println(sumOdd(-1, 100));
//        System.out.println(sumOdd(100, 100));
//        System.out.println(sumOdd(13, 13));
//        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(10, 5));

    }

    public static boolean isOdd(int param) {
        boolean isOd = false;

        if (param < 0) {
            return isOd;
        }
        if (param % 2 != 0) {
            isOd = true;
        }
        return isOd;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || (end < start)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }

        }
        return sum;
    }
}
