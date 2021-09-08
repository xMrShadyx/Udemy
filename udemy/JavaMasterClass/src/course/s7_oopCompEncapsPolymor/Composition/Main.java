package course.s7_oopCompEncapsPolymor.Composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("280inch beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

        thePC.powerUp();

    }
}
