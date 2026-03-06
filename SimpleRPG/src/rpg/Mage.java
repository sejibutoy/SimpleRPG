package rpg;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 100, 30);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " casts a powerful fireball!");
    }
}