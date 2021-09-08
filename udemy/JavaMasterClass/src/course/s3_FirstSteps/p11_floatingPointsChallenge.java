package course.s3_FirstSteps;

public class p11_floatingPointsChallenge {
    public static void main(String[] args) {
        int myVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDouble = 5d / 3d;

        System.out.println("MyIntValue = " + myVal);
        System.out.println("MyFloatValue = " + myFloatVal);
        System.out.println("MyDoubleValue = " + myDouble);

        // in general float and double are great for general floating point operations. But both are
        // not great to use where precise calculations are required - this is due to a limitation with
        // how floating point numbers are stored, and not a java problem as such.

        // Java has a class called BigDecimal that overcomes this. We will talk more about that later in
        // the course. For now just keep in the back of your mind that when precise calculation are
        // necessary, such as when performing currency calculations, floating-points types should not be used.

        // Challenge:
        short pounds = 150;
        double kilos = pounds * 0.45359237;
        System.out.println(kilos);
    }
}
