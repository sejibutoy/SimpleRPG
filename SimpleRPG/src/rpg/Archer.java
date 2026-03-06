package rpg;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 120, 25);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots an arrow!");
    }
}