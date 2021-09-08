package course.s7_oopCompEncapsPolymor.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void lostHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("TOTALLY WASTED!");
            // Reduce number of lives remaining for the player.
            // Respawn the player or ask if he wants to respawn.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
