package course.s7_OopCompEncapsPolymor.Composition;

public class Car extends Vehicle{
    private int door;
    private int engineCapacity;

    public Car(String name, int door, int engineCapacity) {
        super(name);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }
}
