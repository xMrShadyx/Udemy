package a2_Challenges.Wall;

public class p3_Main {
    public static void main(String[] args) {
        p3_Wall wall = new p3_Wall(5,4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
