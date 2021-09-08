package course.s6_oopClassesConstInhert.Car;


public class p1_classesPart1 {
    public static void main(String[] args) {
        p1_Car porsche = new p1_Car();
        p1_Car holden = new p1_Car();

        porsche.setModel("911");
        System.out.println("Model is: " + porsche.getModel());
    }
}
