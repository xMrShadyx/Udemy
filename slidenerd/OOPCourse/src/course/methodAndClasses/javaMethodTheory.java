package course.methodAndClasses;

public class javaMethodTheory {
    public static void main(String[] args) {

    }

}

/* The structure of a method.
                        modifiers  return value         Parameter list
                       /     \      |   ,- Method name /  /
 method header ----> public static int max(int number1, int number2)
                     {
 Method body ----------------> ....
                               ....
 return value ---------------> return answer;

The method header specifies the modifiers, return value type, method name, and parameters of the method.
The optional modifier, tells the compiler how to call the method.
The variables defined in the method header are known as formal parameters or simply parameters.
When a method is invoked, you pass a value to the parameter.
The parameter list refers to the type, order, and number of the parameters of a method.

The Method Callstack
psvm {
    int i=5,j=6;
    int result = max(i,j);
    }

 */

