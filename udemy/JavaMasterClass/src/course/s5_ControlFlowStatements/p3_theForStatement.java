package course.s5_ControlFlowStatements;

public class p3_theForStatement {
    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

//        for (int i = 8; i >= 2; i--) {
//            System.out.println("$10,000 at " + i + "% interest = " + String.format("$%.2f",calculateInterest(10000.0, i)));
//        }
        int primeFound = 0;
        for (int i = 1; i < 50; i++) {
            if (isPrime(i)) {
                primeFound++;
                System.out.println("Prime +1: " + i);
            }
            if (primeFound == 3) {
                System.out.println("Prime loop break;");
                break;
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
