package course.s5_ControlFlowStatements;

public class p1_switchStatement {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//
//        }

//        int switchValue = 2;
//        switch (switchValue) {
//            case 1 -> System.out.println("Value is 1");
//            case 2 -> System.out.println("Value is 2");
//            default -> System.out.println("Was not 1 or 2");
//        }

        char challValue = 'Q';
        switch (challValue) {
            case 'A', 'D', 'B', 'C', 'E' -> System.out.println("Char: " + challValue + " was found");
            default -> System.out.println("Char: " + challValue + " Not found");
        }

    }
}
