package a1_Challenges;

public class a24_allFactors {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int n) {
        if (n < 1) {
            System.out.println("Invalid Value");
        }

        int factor = 1;
        while (factor <= n) {
            if (n % factor == 0) System.out.println(factor);
                factor++;
            }

    }
}
