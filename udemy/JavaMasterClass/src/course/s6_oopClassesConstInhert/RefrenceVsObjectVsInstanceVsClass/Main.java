package course.s6_oopClassesConstInhert.RefrenceVsObjectVsInstanceVsClass;

public class Main {
    public static void main(String[] args) {

    /*Reference vs Object vs Instance vs Class
    *
    * Let's use the analogy of building a house to understand Classes.
    * A class is basically a blueprint for a house, using the blueprint (plans) we can build
    * as many houses we liked based on those plans.
    *
    * Each house you build (in other words instantiate using the new operator) is an object also known as an instance
    * Each house you build has an address (A physical location). In other words if you want to tell someone
    * where you live, you give them your address (perhaps written on a piece of paper). This is known as a refrence
    *
    * You can copy that reference as many times as you like but there is still just one house. In other words
    * we are copying the paper that has address on it not the house itself.
    *
    * We can pass references as parameters to constructors and methods
    * Let's go a little deeper to make this clearer.
    *
    * Here we have a class House with an instance variable (field) color. On the right-hand side we have the Main class
    * with the main method. This code is creating instances of the House class, changing the color and printing out the result.
    * Let's see what happens when this code is executed.*/

        House blueHouse = new House("blue");
        /*The line House blueHouse = new House("blue"); creates a new instance of the House class.
        * Remember House is a blueprint, and we are assigning it to the blueHouse variable. In other words it is a
        * reference to the object in memory. The image on the left hopefully makes sense to you know.
        */

        House anotherHouse = blueHouse;
        /*The next line House anotherHouse = blueHouse; creates another reference to the same object in memory
        * Here we have two references pointing to the same object in memory. There is still one house, but two
        * references to that one object. In other words we hae two pieces of paper with the physical address
        * of where the house is build (going back to our real world example).*/


        System.out.println(blueHouse.getColor()); //blue
        System.out.println(anotherHouse.getColor()); //blue
        /* Next we have two println statements that print the blueHouse color and anotherHouse color. Both will print
        * "blue" since we have two references to same object.*/

        anotherHouse.setColor("yellow");
        // The next line calls the method setColor and sets the color to yellow. To the left you can that both blueHouse
        // and anotherHouse have the same color now. Why remember we have two references that point to the same object in memory
        // Once we change the color address even though we have written the same address on two pieces of paper.

        System.out.println(blueHouse.getColor()); //yellow
        System.out.println(anotherHouse.getColor()); //yellow
        // Here we have two println statements that are printing the color. Both now print "yellow" since we still
        // have two references that point to the same object in memory. Notice the arrow on the left-hand side.

        House greenHouse = new House("green");
        // Here we are creating another new instance of the House class with the color set to "green". Now we have two objects
        // in memory, but we have three references which are blueHouse, anotherHouse, greenHouse. The variable (reference)
        // greenHouse points to a different  object in memory, but blueHouse and anotherHouse points to the same object in memory.

        anotherHouse = greenHouse;
        // Here we assign greenHouse to anotherHouse. In other words we are referencing anotherHouse. It will now point to
        // a different object in memory. Before it was pointing to a house that had the "yellow" color, now it points to the house that has the
        // "green" color.




    }

}
