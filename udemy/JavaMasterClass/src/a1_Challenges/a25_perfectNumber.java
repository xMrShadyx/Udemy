package a1_Challenges;

public class a25_perfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));

    }

    public static boolean isPerfectNumber(int n) {
        if (n < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1 ; i < n ; i++) {
            if(n % i == 0)  {
                sum = sum + i;
            }
        }
        return sum == n;
    }
}
