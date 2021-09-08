package course.methodAndClasses;

public class javaMethods2 {
    public static void main(String[] args) {


         // Step 2 Use the method
        int x =5, y=6;
        int sum = smartAdd(x, y);
        System.out.println(sum);


    }

    /*
    * Step 1 Define the method
    * Specify name
    * Specify what the method does: method body
    * Specify what data the method needs: parameters
    * What type of data and what variable does the method returns?: return type & data
    * Can everyone see the method? Does it have restricted access?: modifier
    *
    * public int add(int a, int b) {
    *       add numbers;
    *       return a + b;
    * }
    *
    * When should I make a method?
    * Ask yourself these question
    * 1: Is that a single operation you want to do? Ex: find simple interest
    *
    * 2: Does it need several steps for doing that operation?
    * Ex: Simple interest get value of p, n, r and calculate p*n*r/100
    * */


    // #1: The Dumb Method:
    // Does the same thing everytime
    public static void dumbAdd() {
        int a = 5, b = 7;
        System.out.println(a + b);
    }

    // #2: The Clever Method:
    // Asks everytime for inout
    public static void cleverAdd(int a, int b) {
        System.out.println(a + b);
    }

    // #3: The Smart Method:
    // Asks for input and also returns a result
    public static int smartAdd(int a, int b) {
        int c = a + b;
        return  c;
    }
}
