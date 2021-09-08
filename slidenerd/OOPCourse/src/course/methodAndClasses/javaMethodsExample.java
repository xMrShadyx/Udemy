package course.methodAndClasses;

public class javaMethodsExample {
    public static void main(String[] args) {
        int a = 5, b = 7, result;

        System.out.println("");
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(int i = 1 ; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].toString());
        }
        System.out.println("");

        result = max(a, b);
        int result2 = min(a, b);
        System.out.println(result);
        System.out.println(result2);


    }

    public static int max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("");
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(int i = 1 ; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].toString());
        }
        System.out.println("");

        return max;
    }

    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        System.out.println("");
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        for(int i = 1 ; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].toString());
        }
        System.out.println("");

        return min;
    }
}
