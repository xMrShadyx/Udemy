package course.s5_ControlFlowStatements;

public class p7_parsingValueFromString {
    public static void main(String[] args) {
        String numberAsString = "2018.12";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }
}
