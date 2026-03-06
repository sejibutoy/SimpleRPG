package rpg;

public class Healer extends Character {

    public Healer(String name) {
        super(name, 110, 10);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks weakly but supports allies!");
    }

    public void heal() {
        System.out.println(getName() + " heals the team!");
    }
}