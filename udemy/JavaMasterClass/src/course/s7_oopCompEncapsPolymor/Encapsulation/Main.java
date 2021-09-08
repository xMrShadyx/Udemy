package course.s7_oopCompEncapsPolymor.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player xMrShadyx = new Player();
//        xMrShadyx.name = "Isko";
//        xMrShadyx.health = 20;
//        xMrShadyx.weapon = "Sword";
//
//        int damage = 10;
//        xMrShadyx.lostHealth(damage);
//        System.out.println("Remaining health = " + xMrShadyx.healthRemaining());
//
//        xMrShadyx.lostHealth(damage);
//        System.out.println("Remaining health = " + xMrShadyx.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
