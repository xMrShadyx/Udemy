package course.methodAndClasses;

public class javaMethodsOverloading {
    public static void main(String[] args) {


    }

    public int max(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        return max;
    }

    public double max(double x, double y) {
        double max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        return max;
    }
}

// What is method overloading?

/*
* Methods within the same class that have the same name but slightly different characteristics (signature) like
* different number of parameters, different type of parameters that perform related operations are called
* overloaded methods.
* When you give two or more methods the same name within the same class, you are overloading the method name.
* Different method definitions have something different about their parameter lists.
* Java distinguishes overloaded methods according to the number of parameters and the types of the parameters.
* When Java code is written to call a method, the compiler checks if the first argument has the same type as the first
* parameter, the second argument has the same type as the second parameter.
* */
