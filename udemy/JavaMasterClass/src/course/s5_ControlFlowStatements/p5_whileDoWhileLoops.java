package course.s5_ControlFlowStatements;

public class p5_whileDoWhileLoops {
    public static void main(String[] args) {
//        int count = 1;

//        while (count != 6) {
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//
//        count = 1;
//        while (count != 6) {
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//
//        do {
//            System.out.println("Current count value is: " + count);
//            count++;
//        } while (count != 6);

        // Create a method called isEvenNumber that takes a parameter of type int.
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;
        int count = 0;
        int record = 0;
        int number = 4;
        int finishNum = 20;

        while (number <= finishNum) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            record += number;
            count++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total record/even numbers are: " + record + "/" + count);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
