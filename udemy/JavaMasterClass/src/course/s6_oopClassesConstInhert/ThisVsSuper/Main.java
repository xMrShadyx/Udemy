package course.s6_oopClassesConstInhert.ThisVsSuper;

public class Main {
    /* This vs Super Methods
    * The keyword super is used to access/call the parent class member (variable and methods)
    * The keyword this is used to call the current class members (variables and methods)
    * NOTE: We can use both of them anywhere in a class except static areas (the static block or
    * a static method) Any attempt to do so will lean to compile-time errors (more on static later in the course)
    * The keyword this is commonly used with constructors and setters, and optionally in getters (easier for beginners).
    * In the example below we are using the "this" keyword in the constructor and setter since there is a parameter
    * with the same name. In the getter we don't have any parameters so the "This" keyword is optional

    private String color;

    public Main(String color) {
        // This keyword is required, same parameter name as field
        this.color = color;
    }

    public String getColor() {
        // this is optional
        return color; // same as return this.color;
    }

    public void setColor(String color) {
        // this keyword is required, same parameter name as field
        this.color = color;
    }

    * Keyword Super
    * The keyword super is commonly used with method overriding, when we call a method with the same name from the parent class.
    * In the example below we have method printMethod that calls super.printMethod.


    public void printMethod() {
        System.out.println("Printed in Superclass");
    }
}

class SubClass extends Main {
    //Overrides method from parent
    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("printed is SubClass");
    }
}

class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}

     In other words it's calling the method with the same name from the parent class. Without the keyword
     * super in this case it would be recursive call. Meaning that the method would call itself forever (or until memory is fully used)
     * That is why the super keyword is needed.
     *
     * this() vs super() call
     * In java we have this() call and the super() call. Notice the braces it is known as a call since it look a
     * regular method call.
     * Use this() to call a constructor from another overloaded constructor in the same class.
     * The call to this() can be used only in a constructor, and it must be the first statement in a constructor. It's used with constructor chaining,
     * in other words when one constructor calls another constructor, and helps to reduce duplicated code.
     * The only way to call a parent constructor is by calling super(). This calls the parent constructor
     *
     * The Java compiler puts a default call to super() if we don't add it, and it is always the no-args super which is inserted by compiler
     * (constructor without arguments).
     * The call super() must be the first statement in each constructor
     * Even abstract classes have constructors, although you can never instantiate an abstract class using the new keyword
     * An abstract class is still a super class, so its constructors run when you make an instance of concrete subclass
     * NOTE: A constructor can have a call to super() or this() but never both.
     *
     * Constructor bad example:
     * In this example we have three constructors
     * All three constructors initialize variables
     * There is repeated code in every constructor We are initializing variables
     * in each constructor with some default values
     * You should never write constructors like this.



class Rectangle {
    private int x;
    private int y;
    private int width;
    private  int height;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
    In this example we have three constructors
    * The 1st constructor call the 2nd. the 2nd constructor, and the 3rd constructors
    * initializes the instance variables.
    * The 3rd constructor does all the word.
    * No matter what constructor we call, the variables will always be initialized in 3rd constructor.
    * This is known as constructor chaining the last constructor has the
    * responsibility to initialize the variables.


class Rectangle {
    private int x;
    private int y;
    private int width;
    private  int height;

    public Rectangle() {
        this(0,0); // calls 2nd constructor
    }

    public Rectangle(int width, int height) {
        this(0, 0,width,height); // calls 3rd constructor;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

      In this example we have a class Shape with x,y variables and class Rectangle
      * that extends Shape with variables width and height
      * In Rectangle, the 1st constructor we are calling the 2nd constructor
      * The 2nd constructor calls the parent constructor with parameters x and y
      * The parent constructor will initialize the width and height variables
      * Here we have both super() and this() calls

class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    */
}