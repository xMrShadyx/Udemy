package course.s5_ControlFlowStatements;

public class p4_sum3And5Challenge {
    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println("Found number = " + i);
                counter++;
                if (counter == 5){
                    System.out.println("Total Sum is: " + sum);
                    break;
                }
            }

        }
    }
}
