package Assignment;

public class Main {
    public static void main(String[] args) {

        Sword sword = new Sword("Blade of Despair", "A", 6800, 100);
        Shield shield = new Shield("Dominance ice", "B", 2500, 80);
        Potion healPotion = new Potion("Rock Potion", "S", 10000, 3, 80, "heal");
        Potion attackPotion = new Potion("Power Potion", "A", 8000, 12, 50, "attack");


        healPotion.use();
        attackPotion.use();
        sword.use();
        shield.use();
    }
}