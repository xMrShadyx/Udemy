package course.s7_OopCompEncapsPolymor.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void lostHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("TOTALLY WASTED!");
            // Reduce number of lives remaining for the player.
            // Respawn the player or ask if he wants to respawn.
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
