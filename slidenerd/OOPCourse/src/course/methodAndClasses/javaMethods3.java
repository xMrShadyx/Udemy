package course.methodAndClasses;

public class javaMethods3 {
    public static void main(String[] args) {
//        calculate();
        int x = add(5,6);
        int y = difference(14, 20);
        int z = multiply(12, 22);
        int k = division(15, 3);

        System.out.printf("%d%n%d%n%d%n%d",x,y,z,k);
    }

//    public static void calculate() {
//        int a = 10, b = 5;
//
//        int sum = a + b;
//        System.out.println(a + b);
//
//        int difference = a - b;
//        System.out.println(a - b);
//
//        int multiply = a * b;
//        System.out.println(a * b);
//
//        int division = a / b;
//        System.out.println(a / b);
//    }

    public static int add(int a, int b) {
//        int a = 10, b = 5;
        int sum = a + b;
//        System.out.println(a + b);
        return sum;
    }

    public static int difference(int a, int b) {
//        int a = 10, b = 5;
        int difference = a - b;
//        System.out.println(a - b);
        return difference;
    }

    public static int multiply(int a, int b) {
//        int a = 10, b = 5;
        int multiply = a * b;
//        System.out.println(a * b);
        return multiply;
    }


    public static int division(int a, int b) {
//        int a = 10, b = 5;
        int division = a / b;
//        System.out.println(a / b);
        return division;
    }
}
