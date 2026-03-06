package rpg;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " slashes with a sword!");
    }
}